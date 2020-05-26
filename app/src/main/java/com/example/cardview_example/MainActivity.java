package com.example.cardview_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Course> first_Course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_Course = new ArrayList<>();

        first_Course.add(new Course("부산 2박 3일 여행코스", "여행코스", "깔깔",R.drawable.first));
        first_Course.add(new Course("부산 여행 코스 추천 6곳", "여행코스", "즐거워",R.drawable.second));
        first_Course.add(new Course("부산 1박 2일 밤도깨비 여행 코스", "여행코스", "조사",R.drawable.third));
        first_Course.add(new Course("부산 자유여행 1박 2일 여행코스", "여행코스", "해서 넣을 부분",R.drawable.fourth));
        first_Course.add(new Course("부산 겨울 당일치기 코스", "여행코스", "^^",R.drawable.fifth));
        first_Course.add(new Course("부산 핫스팟 여행 코스", "여행코스", "사진 출처 구글",R.drawable.sixth));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerView.Adapter myAdapter = new RecyclerViewAdapter(this,first_Course);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
