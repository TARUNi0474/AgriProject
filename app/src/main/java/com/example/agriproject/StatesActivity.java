package com.example.agriproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StatesActivity extends AppCompatActivity {
    RecyclerView rv;
    String name[]={"AndhraPradesh","ArunachalPradesh","Assam","Bihar","Chattisgarh",
    "Goa","Gujarat","Harayana","HimachalPradesh","Jharkhand",
    "Karnataka","Kerala","MadhyaPradesh","Maharashtra","Manipur",
    "Meghalaya","Mizoram","Nagaland","Odisha","Punjab",
    "Rajasthan","Sikkim","Tamilnadu","Telangana","Tripura","Uttarakhand"
    ,"UttarPradesh","WestBengal"};
    int image[]={R.drawable.ap,R.drawable.arunachal,R.drawable.assam,R.drawable.bihar,R.drawable.chattisgarh,
    R.drawable.goa,R.drawable.gujarat,R.drawable.harayana,R.drawable.himachal,R.drawable.jharkhand,
    R.drawable.karnataka,R.drawable.kerala,R.drawable.madhya,R.drawable.mumbai,R.drawable.manipur,
    R.drawable.meghalaya,R.drawable.mizoram,R.drawable.nagaland,R.drawable.odisha,R.drawable.punjab,
    R.drawable.rajasthan,R.drawable.sikkim,R.drawable.tamilnadu,R.drawable.telangana,R.drawable.tripura,R.drawable.uttarakhand,
    R.drawable.up,R.drawable.kolkata};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);
        rv=findViewById(R.id.rv);
        MyAdapter adapter=new MyAdapter(this,name,image);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new GridLayoutManager(this,2));
    }
}