package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ChatContentActivity extends AppCompatActivity {
    public final static String userID = "VX3ykLUG7JQXFAGvmyMiRlxqQ1c2)";
    EditText chatText;
    FrameLayout sendButton;
    RecyclerView recyclerView;
    ArrayList<ChatModel>list = new ArrayList<>();
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
    RecyclerAdapterChat recyclerAdapterChat = new RecyclerAdapterChat();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_content);
        chatText = findViewById(R.id.inputMessage);
        sendButton = findViewById(R.id.layoutSend);
        recyclerView = findViewById(R.id.chatRecycler);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = chatText.getText().toString().trim();
                if(!message.isEmpty())
                    sendMessage(message);

            }
        });

        getMessage();

    }

    private void sendMessage(String message){
        ref.child("message").push().setValue(new ChatModel(message,userID));
        chatText.setText("");
    }

    private void getMessage(){
        ref.child("message").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                list.clear();
                for (DataSnapshot snapshot1 : snapshot.getChildren()){

                    list.add(snapshot1.getValue(ChatModel.class));

                }
                recyclerAdapterChat.setList(list);
                recyclerView.setAdapter(recyclerAdapterChat);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}