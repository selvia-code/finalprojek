package com.belajarandroid.contohcardview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<DataModel> dataList;



    //getting the context and product list with constructor
    public CustomAdapter(Context mCtx, List<DataModel> dataList) {
        this.mCtx = mCtx;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.cards_layout, null);
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);
        return new MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //getting the product of the specified position
        DataModel dataSet = dataList.get(position);


        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.getnama());
        textViewVersion.setText(dataSet.getversion());

        Picasso.with(mCtx).load( "https://www.kakitujuh.com/promodel/image/" + dataSet.getimage().toString() ).into(imageView);



//        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));


    }



    @Override
    public int getItemCount() {
        return dataList.size();
    }




    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}



//public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
//
//    private ArrayList<DataModel> dataSet;
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder {
//
//        TextView textViewName;
//        TextView textViewVersion;
//        ImageView imageViewIcon;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
//            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
//            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
//        }
//    }
//
//    public CustomAdapter(ArrayList<DataModel> data) {
//        this.dataSet = data;
//    }
//
//    @Override
//    public MyViewHolder onCreateViewHolder(ViewGroup parent,
//                                           int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.cards_layout, parent, false);
//
//        view.setOnClickListener(MainActivity.myOnClickListener);
//
//        MyViewHolder myViewHolder = new MyViewHolder(view);
//        return myViewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
//
//        TextView textViewName = holder.textViewName;
//        TextView textViewVersion = holder.textViewVersion;
//        ImageView imageView = holder.imageViewIcon;
//
//        textViewName.setText(dataSet.get(listPosition).getName());
//        textViewVersion.setText(dataSet.get(listPosition).getVersion());
//        imageView.setImageResource(dataSet.get(listPosition).getImage());
//    }
//
//    @Override
//    public int getItemCount() {
//        return dataSet.size();
//    }
//}
