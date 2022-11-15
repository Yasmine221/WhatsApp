import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.R;

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
                .inflate(R.layout.item_container_sent_message,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        ChatModel chatModel = list.get(position);
        holder.sendMessage.setText(chatModel.getMessage());

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
