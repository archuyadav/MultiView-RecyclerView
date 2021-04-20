package com.example.SwapableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.SwapableRecyclerView.R;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter {

    private static final String TAG = "Adapter";
    List<String> stringList;

    public Adapter(List<String> stringList) {

        this.stringList = stringList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;

        if (viewType == 0) {
            view = layoutInflater.inflate(R.layout.item, parent, false);
            return new ViewHolderOne(view);
        }else{
            view = layoutInflater.inflate(R.layout.another_item, parent, false);
            return new ViewHolderTwo(view);


        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (stringList.get(position).toLowerCase().contains("i am here to help you....")) {
            ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
            viewHolderOne.textView.setText(stringList.get(position));
            //viewHolderOne.imageView.setImageResource(Integer.parseInt(stringList.get(position)));
//            viewHolderOne.rowCountTextView.setText(String.valueOf(position));
        } else {
            ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
            viewHolderTwo.textL.setText(stringList.get(position));
            //viewHolderTwo.imgL.setImageResource(Integer.parseInt(stringList.get(position)));
        }


    }

    public int getItemViewType(int position) {
//        if (position % 2 == 0) {
//            return 0;
//        }
//        return 1;

        if (stringList.get(position).toLowerCase().contains("i am here to help you....")) {
            return 0;
        }
        return 1;
    }


    @Override
    public int getItemCount() {
        return stringList.size();
    }

    class ViewHolderOne extends RecyclerView.ViewHolder {

        TextView textView;
        //ImageView imageView;

        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            // imageView = itemView.findViewById(R.id.imgView);
            textView = itemView.findViewById(R.id.textView);
//            imageView = itemView.findViewById(R.id.imageView);

        }
    }

    class ViewHolderTwo extends RecyclerView.ViewHolder {

        TextView textL;
        //  ImageView imgL;

        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
            // imgL = itemView.findViewById(R.id.imgLove);
            textL = itemView.findViewById(R.id.textLove);
        }

        }
    }




