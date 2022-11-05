package com.example.whatsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ChatFragment extends Fragment {

    RecyclerView recyclerView;
    ChatAdapter chatAdapter;
    ArrayList<ChatData> data = new ArrayList<>();

    public ChatFragment() {}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecycler(view);
    }

    private void setupRecycler(View view) {

        data.add(new ChatData(R.drawable.user_image,"YASMINE","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"ROUEN","WE MISS YOU <33"));
        data.add(new ChatData(R.drawable.user_image,"HEBA","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"GHADEER","Hey KHARKHORA"));
        data.add(new ChatData(R.drawable.user_image,"MAI","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"SHOROK","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"DINA","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"SAHAR","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"HAGAR","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"REEM","Hey there, I'm using WhatsApp!"));
        data.add(new ChatData(R.drawable.user_image,"YASMINE","Hey there, I'm using WhatsApp!"));



        recyclerView = view.findViewById(R.id.recycler_view);
        chatAdapter = new ChatAdapter(data);
        recyclerView.setAdapter(chatAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));



    }
}