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
//1
        first_Course.add(new Course("부산바다 당일치기", "당일여행",
                "추천코스\n " +
                        "광안리해수욕장/광안대교 - 해운대해수욕장 - 부산아쿠아리움 - 달맞이길/문탠로드 - 청사포 - 용궁사\n\n",
                "부산의 랜드마크 중 하나인 광안대교를 한눈에 담을 수 있는 이곳은 사시사철 여행자로 북적인다. 사람들은 낮과 밤이 선사하는 각기 다른 광안리해수욕장의 매력에 흠뻑 빠져든다." +
                        " 특히 부산불꽃축제가 열리는 가을밤이면 광안리해수욕장 앞바다는 화려한 불꽃의 향연으로 물든다.\n",
                "해운대해수욕장은 넓고 고운 백사장을 가진 대한민국 대표 해수욕장으로 부산 시민보다 여행자로 더 북적이는 곳이다. " +
                        "해수욕장 주변에는 산책코스가 잘 갖춰져 있고 그 중 아름답기로 소문난 동백해안산책로는 바다, 바람, 그리고 도시풍경을 가장 가까이에서 만끽할 수 있는 코스이다. " +
                        "해운대의 또 다른 즐길거리 부산아쿠아리움도 방문해보자. " +
                        "살아 있는 다양한 해양생물을 직접 눈으로 관찰할 수 있으며 머리 위로 유유자적하는 상어와 가오리는 감탄을 자아낸다.\n\n",
                "다양한 색깔을 가진 부산 바다.\n" +
                        "숲과 사람, 바다의 매력을 하루 만에 만나볼 수 있는 부산바다 당일치기코스!\n" +
                        "끊임없이 밀려드는 파도처럼 부산 바다의 매력을 제대로 만나보자.", R.drawable.daytrip1));
//2
        first_Course.add(new Course("2박 3일에 완성하는 부산 완전정복", "2박 3일",
                "추천코스\n" + "\n" ,"","","", R.drawable.two_three_second));
//3
        first_Course.add(new Course("2박 3일에 완성하는 부산 완전정복", "2박 3일",
                "추천코스\n" + "\n" ,"","","", R.drawable.a_week));

        first_Course.add(new Course("2박 3일에 완성하는 부산 완전정복", "2박 3일",
                "추천코스\n" + "\n" ,"","","", R.drawable.fourth));
        first_Course.add(new Course("2박 3일에 완성하는 부산 완전정복", "2박 3일",
                "추천코스\n" + "\n" ,"","","", R.drawable.fifth));
        first_Course.add(new Course("2박 3일에 완성하는 부산 완전정복", "2박 3일",
                "추천코스\n" + "\n" ,"","","", R.drawable.sixth));

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