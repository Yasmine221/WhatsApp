package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.databinding.ItemCallsLayoutBinding;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CallAdapter<CallAction> extends RecyclerView.Adapter<CallAdapter.CallHolder> {

    private List<CallData>callData;

    public CallAdapter(List<CallData> callData) {
        this.callData = callData;
    }

    @NonNull
    @Override
    public CallHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_calls_layout,parent,false);
        return new CallHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallHolder holder, int position) {
        CallData data = callData.get(position);

        holder.callImage.setImageResource(data.getCallImage());
        holder.callerName.setText(data.getCallerName());
        holder.callTime.setText(data.getCallTime());

    }

    @Override
    public int getItemCount() {

        if (callData != null)
            return callData.size();

        return 0;
    }

    static class CallHolder extends RecyclerView.ViewHolder {
        CircleImageView callImage;
        TextView callerName;
        TextView callTime;
        public CallHolder(@NonNull View itemView) {
            super(itemView);

            callerName = itemView.findViewById(R.id.caller_name);
            callTime = itemView.findViewById(R.id.call_time);
            callImage = itemView.findViewById(R.id.call_img);
        }
    }
}
