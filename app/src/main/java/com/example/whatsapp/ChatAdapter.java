package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatHolder>{

    private List<ChatData> data;

    public ChatAdapter(List<ChatData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,parent,false);
        return new ChatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder holder, int position) {

        ChatData chatData = data.get(position);

        holder.userName.setText(chatData.getUserName());
        holder.userMessage.setText(chatData.getUserMessage());
        holder.userImage.setImageResource(chatData.getUserImage());


    }

    @Override
    public int getItemCount() {

        if ( data != null)
            return data.size();
        else
            return 0;

    }

    static class ChatHolder extends RecyclerView.ViewHolder {
        CircleImageView userImage;
        TextView userName;
        TextView userMessage;


        public ChatHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.img_user);
            userName = itemView.findViewById(R.id.user_name);
            userMessage = itemView.findViewById(R.id.user_msg);

        }
    }
}
