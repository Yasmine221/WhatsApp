package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapterChat extends RecyclerView.Adapter<RecyclerAdapterChat.Holder> {
    ArrayList<ChatModel>list;

    public void setList(ArrayList<ChatModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_chat_content,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        ChatModel chatModel = list.get(position);
        holder.sendMessage.setText(chatModel.getMessage());

        if (chatModel.getSenderID().equals(ChatContentActivity.userID)){

            holder.equals(R.layout.item_container_sent_message);
        }
        else {
            holder.equals(R.layout.item_container_recieved_message);
        }

    }

    @Override
    public int getItemCount() {
        if (list != null)
            return list.size();
        return 0;
    }

    static class Holder extends RecyclerView.ViewHolder{

        TextView sendMessage;

        public Holder(@NonNull View itemView) {
            super(itemView);

            sendMessage = itemView.findViewById(R.id.textMessage);
        }
    }
}
