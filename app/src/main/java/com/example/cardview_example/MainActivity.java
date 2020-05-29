package com.example.cardview_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
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

        first_Course.add(new Course("부산바다 당일치기", "당일여행",
                "추천코스\n " +
                        "광안리해수욕장/광안대교 - 해운대해수욕장 - 부산아쿠아리움 - 달맞이길/문탠로드 - 청사포 - 용궁사\n\n",
                "부산의 랜드마크 중 하나인 광안대교를 한눈에 담을 수 있는 이곳은 사시사철 여행자로 북적인다. 사람들은 낮과 밤이 선사하는 각기 다른 광안리해수욕장의 매력에 흠뻑 빠져든다." +
                        " 특히 부산불꽃축제가 열리는 가을밤이면 광안리해수욕장 앞바다는 화려한 불꽃의 향연으로 물든다.\n", R.drawable.daytrip1,R.drawable.a_week));

  /*      first_Course.add(new Course("부산바다 당일치기", "당일여행",
                "추천코스\n " +
                        "광안리해수욕장/광안대교 - 해운대해수욕장 - 부산아쿠아리움 - 달맞이길/문탠로드 - 청사포 - 용궁사\n\n",
                "부산의 랜드마크 중 하나인 광안대교를 한눈에 담을 수 있는 이곳은 사시사철 여행자로 북적인다. 사람들은 낮과 밤이 선사하는 각기 다른 광안리해수욕장의 매력에 흠뻑 빠져든다." +
                        " 특히 부산불꽃축제가 열리는 가을밤이면 광안리해수욕장 앞바다는 화려한 불꽃의 향연으로 물든다.\n", R.drawable.daytrip1));

        first_Course.add(new Course("부산바다 당일치기", "당일여행",
                "추천코스\n " +
                        "광안리해수욕장/광안대교 - 해운대해수욕장 - 부산아쿠아리움 - 달맞이길/문탠로드 - 청사포 - 용궁사\n\n",
                "부산의 랜드마크 중 하나인 광안대교를 한눈에 담을 수 있는 이곳은 사시사철 여행자로 북적인다. 사람들은 낮과 밤이 선사하는 각기 다른 광안리해수욕장의 매력에 흠뻑 빠져든다." +
                        " 특히 부산불꽃축제가 열리는 가을밤이면 광안리해수욕장 앞바다는 화려한 불꽃의 향연으로 물든다.\n", R.drawable.daytrip1));

        first_Course.add(new Course("부산바다 당일치기", "당일여행",
                "추천코스\n " +
                        "광안리해수욕장/광안대교 - 해운대해수욕장 - 부산아쿠아리움 - 달맞이길/문탠로드 - 청사포 - 용궁사\n\n",
                "부산의 랜드마크 중 하나인 광안대교를 한눈에 담을 수 있는 이곳은 사시사철 여행자로 북적인다. 사람들은 낮과 밤이 선사하는 각기 다른 광안리해수욕장의 매력에 흠뻑 빠져든다." +
                        " 특히 부산불꽃축제가 열리는 가을밤이면 광안리해수욕장 앞바다는 화려한 불꽃의 향연으로 물든다.\n", R.drawable.daytrip1));*/

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerView.Adapter myAdapter = new RecyclerViewAdapter(this, first_Course);

//        myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 가로 레이아웃
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(verticalLayoutManager);

        myrv.setAdapter(myAdapter);
    }
}