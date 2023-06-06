package com.poly.soundboard;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewAdapterSoundBoard extends RecyclerView.Adapter<RecyclerViewAdapterSoundBoard.MyViewHolder> {
    Context context;
    private OnItemClickListener listener;
    ArrayList<ModelSoundBoard> soundboardModels;

    public interface OnItemClickListener {
        void onItemClick(ModelSoundBoard modelSoundBoard);
    }

    public RecyclerViewAdapterSoundBoard(Context context, ArrayList<ModelSoundBoard> soundboardModels) {
        this.context = context;
        this.soundboardModels = soundboardModels;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(this.context).inflate(R.layout.recycler_view_row, parent, false));
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind(this.soundboardModels.get(position), this.listener);
    }

    public int getItemCount() {
        return this.soundboardModels.size();
    }

    public void setOnClickListener(OnItemClickListener listener2) {
        this.listener = listener2;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvAuthor;
        TextView tvTitle;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            this.tvAuthor = (TextView) itemView.findViewById(R.id.tv_author);
        }

        public void bind(final ModelSoundBoard model, final OnItemClickListener listener) {
            this.tvTitle.setText(model.getTitle());
            this.tvAuthor.setText(model.getAuthor());
            Log.d("bind", model.getTitle());
            this.itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Log.d("click", model.getTitle());
                    listener.onItemClick(model);
                }
            });
        }
    }
}
