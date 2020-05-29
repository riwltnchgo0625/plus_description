package com.example.cardview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Course_Activity extends AppCompatActivity {
    private TextView tvtitle, tvdescription, tvcategory,tvdescription2,tvdescription3,tvdescription4;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_);

        tvtitle = (TextView) findViewById(R.id.tvtitle);
        tvdescription = (TextView) findViewById(R.id.tvdescription);
        tvdescription2 = (TextView) findViewById(R.id.tvdescription2);
        tvdescription3 = (TextView) findViewById(R.id.tvdescription3);
        tvdescription4 = (TextView) findViewById(R.id.tvdescription4);
        tvcategory = (TextView) findViewById(R.id.tvcategory);
        img = (ImageView) findViewById(R.id.coursethumbnail);

        // Receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Description2 = intent.getExtras().getString("Description2");
        String Description3 = intent.getExtras().getString("Description3");
        String Description4 = intent.getExtras().getString("Description4");
        String Category = intent.getExtras().getString("Category");
        int image = intent.getExtras().getInt("Thumbnail");

        // Setting values

        tvtitle.setText(Title);
        tvdescription2.setText(Description2);
        tvdescription3.setText(Description3);
        tvdescription4.setText(Description4);
        tvdescription.setText(Description);
        tvcategory.setText(Category);
        img.setImageResource(image);
    }
}