package com.icontech.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "com.icontech.recyclerviewdemo.RecyclerViewAdapter";

    private Context context;
    private ArrayList<String> mimagename= new ArrayList<>();
    private ArrayList<String> mimage= new ArrayList<>();

    public RecyclerViewAdapter(Context context, ArrayList<String> mimagename, ArrayList<String> mimage) {
        this.context = context;
        this.mimagename = mimagename;
        this.mimage = mimage;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context)
                .asBitmap()
                .load(mimage.get(position))
                .into(holder.image);

        holder.image_names.setText(mimagename.get(position));
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,mimagename.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mimagename.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ConstraintLayout parent_layout;
        ImageView image;
        TextView image_names;

        public ViewHolder(View itemView) {
            super(itemView);
            parent_layout=itemView.findViewById(R.id.parent_layout);
            image=itemView.findViewById(R.id.image);
            image_names=itemView.findViewById(R.id.image_names);
        }
    }
}
