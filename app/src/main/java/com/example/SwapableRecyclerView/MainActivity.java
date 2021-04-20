package com.example.SwapableRecyclerView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.SwapableRecyclerView.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 RecyclerView recyclerView;
 Adapter Adapter;
 List<String> stringList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager lm=new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lm);

     stringList = new ArrayList<>();
     stringList.add("Hiiiiiii....");
     stringList.add("How are You??");
     stringList.add("i am here to help you....");
     stringList.add("Hello...");
     stringList.add("I am Fine");
     stringList.add("What about You?");
     stringList.add("I am also fine");
     stringList.add("Nice to talk to you");
     stringList.add("Same here....");
        stringList.add("i am here to help you....");
     stringList.add("Hiiiiiii....");
     stringList.add("How are You??");
     stringList.add("Hello...");
        stringList.add("i am here to help you....");
     stringList.add("I am Fine");
     stringList.add("What about You?");
     stringList.add("I am also fine");
     stringList.add("Nice to talk to you");
     stringList.add("Same here....");
        stringList.add("i am here to help you....");
        stringList.add("Hiiiiiii....");
        stringList.add("How are You??");
        stringList.add("i am here to help you....");
        stringList.add("Hello...");
        stringList.add("I am Fine");
        stringList.add("What about You?");
        stringList.add("I am also fine");
        stringList.add("Nice to talk to you");
        stringList.add("Same here....");
        stringList.add("i am here to help you....");
        stringList.add("Hiiiiiii....");
        stringList.add("How are You??");
        stringList.add("Hello...");
        stringList.add("i am here to help you....");
        stringList.add("I am Fine");
        stringList.add("What about You?");
        stringList.add("I am also fine");
        stringList.add("Nice to talk to you");
        stringList.add("Same here....");
        stringList.add("i am here to help you....");


        recyclerView.setHasFixedSize(true);
     Adapter = new Adapter(stringList);
     recyclerView.setAdapter(Adapter);
     DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
     recyclerView.addItemDecoration(dividerItemDecoration);

     //for right swipe.....

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT) {


            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                stringList.remove(viewHolder.getAdapterPosition());


                Adapter.notifyDataSetChanged();



            }
        }).attachToRecyclerView(recyclerView);


        //for left swipe


        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT) {


            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                stringList.remove(viewHolder.getAdapterPosition());


                Adapter.notifyDataSetChanged();



            }
        }).attachToRecyclerView(recyclerView);



    }
}