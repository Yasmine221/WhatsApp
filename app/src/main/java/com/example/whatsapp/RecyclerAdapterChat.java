package com.example.whatsapp;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.whatsapp.databinding.ActivityChatContentBinding;
import com.example.whatsapp.databinding.ItemSentMessageLayoutBinding;

import java.util.ArrayList;

public class RecyclerAdapterChat extends RecyclerView.Adapter<RecyclerAdapterChat.Holder> {

    ArrayList<ChatModel> list;

    public void setList(ArrayList<ChatModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSentMessageLayoutBinding binding = ItemSentMessageLayoutBinding.bind(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sent_message_layout,parent,false));
        return new Holder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        ChatModel chatModel = list.get(position);

        if (chatModel.getSenderID().equals(ChatContentActivity.userID)) {
            holder.binding.sentMessage.setText(chatModel.getMessage());
        } else {
            holder.binding.receivedMessage.setText(chatModel.getMessage());
        }
        holder.binding.sentMessage.setText(chatModel.getMessage());

    }

    @Override
    public int getItemCount() {
        if (list != null)
            return list.size();
        return 0;
    }


    static class Holder extends RecyclerView.ViewHolder {
        ItemSentMessageLayoutBinding binding;

        public Holder(ItemSentMessageLayoutBinding itemSentMessageLayoutBinding) {
            super(itemSentMessageLayoutBinding.getRoot());
            binding = itemSentMessageLayoutBinding;
        }

    }
}
