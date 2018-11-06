package com.manekineko.recyclerview_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final static int TYPE1 = 0;
    private final static int TYPE2 = 1;
    private ArrayList<Info> infoArrayList;
    private OnClickListener listener;

    public interface OnClickListener{
        void click(Info info);
        void insert();
        void delete();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvDate;
        TextView tvTitle;
        TextView tvDetail;

        MyViewHolder(View view){
            super(view);
            tvTitle = view.findViewById(R.id.tv_title);
            tvDate = view.findViewById(R.id.tv_date);
            tvDetail = view.findViewById(R.id.tv_detail);
        }
        void bind(final Info info){

        }
    }

    MyAdapter(OnClickListener listener){
        this.listener = listener;
        this.infoArrayList = new ArrayList<>();
    }
    public void update(ArrayList<Info> InfoArrayList){
        this.infoArrayList = InfoArrayList;
        notifyDataSetChanged();
    }
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row,parent,false);
        return new MyViewHolder(view);
    }
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){
        Info info = infoArrayList.get(position);
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.bind(info);

        myViewHolder.tvDetail.setText(infoArrayList.get(position).detail);
        myViewHolder.tvDate.setText(infoArrayList.get(position).date);
        myViewHolder.tvTitle.setText(infoArrayList.get(position).title);
    }
    public int getItemCount() {
        return infoArrayList.size();
    }
}
