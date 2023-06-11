package com.poly.soundboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewAdapterBacktrack extends RecyclerView.Adapter<RecyclerViewAdapterBacktrack.MyViewHolder> {
    ArrayList<ModelBacktrack> backtrackModels;
    Context context;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ModelBacktrack modelBacktrack);
    }

    public RecyclerViewAdapterBacktrack(Context context2, ArrayList<ModelBacktrack> backtrackModels) {
        this.context = context2;
        this.backtrackModels = backtrackModels;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(this.context).inflate(R.layout.recycler_view_row, parent, false));
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind(this.backtrackModels.get(position), this.listener);
    }

    public int getItemCount() {
        return this.backtrackModels.size();
    }

    public void setOnClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvAuthor;
        TextView tvTitle;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            this.tvAuthor = (TextView) itemView.findViewById(R.id.tv_author);
        }

        public void bind(final ModelBacktrack model, final OnItemClickListener listener) {
            this.tvTitle.setText(model.getTitle());
            this.tvAuthor.setText(model.getAuthor());
            this.itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listener.onItemClick(model);
                }
            });
        }
    }
}
