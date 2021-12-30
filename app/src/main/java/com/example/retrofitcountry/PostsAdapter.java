package com.example.retrofitcountry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private Context context;
    private List<Posts> postsList;

    public PostsAdapter(Context context, List<Posts> postsList) {
        this.context = context;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context)
               .inflate(R.layout.countrylist,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvName.setText(postsList.get(position).getCname().getName());
        holder.tvCapital.setText(String.valueOf(postsList.get(0).getCapital()));
        holder.tvRegion.setText(postsList.get(position).getRegion());


        Glide.with(context)
                .load(postsList.get(position).getFlag().getCflag())
                .into(holder.imgFlag);


    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvCapital;
        TextView tvRegion;
        ImageView imgFlag;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFlag = itemView.findViewById(R.id.flag);
            tvName = itemView.findViewById(R.id.name);
            tvCapital = itemView.findViewById(R.id.capital);
            tvRegion = itemView.findViewById(R.id.region);

        }
    }
}
