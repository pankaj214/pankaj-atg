package com.example.atg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Myadapter extends ArrayAdapter {
    List<String> listTitle;
List<Integer> imageList;
Context context;
    public Myadapter(@NonNull Context context, List<String> title,List<Integer> image) {
        super(context,R.layout.hello,title);
        this.listTitle=title;
        this.imageList=image;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.hello,parent,false);
        TextView textView=view.findViewById(R.id.textView);
        ImageView imageView=view.findViewById(R.id.imageView);
        textView.setText(listTitle.get(position));
        imageView.setImageResource(imageList.get(position));
        return view;
    }
}
