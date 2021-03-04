package com.example.atg;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        List<String> title=new ArrayList<>();
        List<Integer> image=new ArrayList<>();


        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");
        title.add("");


image.add(R.drawable.one);
image.add(R.drawable.two);
        image.add(R.drawable.three);
        image.add(R.drawable.four);
        image.add(R.drawable.five);
        image.add(R.drawable.six);
        image.add(R.drawable.seven);
        image.add(R.drawable.eight);
        image.add(R.drawable.nine);
        image.add(R.drawable.ten);
        image.add(R.drawable.eleven);
        image.add(R.drawable.twelve);
        image.add(R.drawable.thirteen);
        image.add(R.drawable.fourteen);
        image.add(R.drawable.fifteen);
        image.add(R.drawable.sixteen);
        image.add(R.drawable.seventeen);
        image.add(R.drawable.eighteen);
           Myadapter myadapter=new Myadapter(this,title,image);
           listView.setAdapter(myadapter);

    }
}