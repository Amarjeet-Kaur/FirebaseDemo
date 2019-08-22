package com.myappnew.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.MyviewHolder> {
    List<model> list;
    Context activity;
    String image, title, link;

    //itemclicklistener listener;
    public Recycler_Adapter(Context activity, List<model> list) {
        this.list = list;
        this.activity = activity;
        //this.listener=itemclicklistener;
    }

    public Recycler_Adapter(FragmentActivity activity, Object value, long childrenCount) {
    }


    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler, parent, false);

        //final MyviewHolder mviewHolder = new MyviewHolder(itemView);

        return new MyviewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyviewHolder holder, final int position) {
        image = list.get(position).getImage().toString();
        title = list.get(position).getTitle().toString();
        link = list.get(position).getSong().toString();
        holder.tv_title.setText(title);
// Glide.with(activity).load(dataat).into(holder.iv_albumart);
//        holder.tv_category.setText(list.get(position).getCategory());
        Picasso.with(activity).load(image).placeholder(R.drawable.no_cover).into(holder.iv_albumart);
        holder.iv_download_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        private TextView tv_title;
        private RoundedImageView iv_albumart;
        TextView iv_download_button;

        public MyviewHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            iv_albumart = itemView.findViewById(R.id.iv_albumart);
            iv_download_button = itemView.findViewById(R.id.iv_download_button);
        }
    }
}

