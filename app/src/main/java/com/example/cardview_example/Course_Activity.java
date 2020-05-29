package com.example.cardview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Course_Activity extends AppCompatActivity {
    private TextView tvtitle, tvdescription, tvcategory,tvdescription2;
    private ImageView img, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_);

        tvtitle = (TextView) findViewById(R.id.tvtitle);
        tvdescription = (TextView) findViewById(R.id.tvdescription);
        tvdescription2 = (TextView) findViewById(R.id.tvdescription2);
        tvcategory = (TextView) findViewById(R.id.tvcategory);
        img = (ImageView) findViewById(R.id.coursethumbnail);
        img2 = (ImageView) findViewById(R.id.coursethumbnail2);


        // Receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Description2 = intent.getExtras().getString("Description2");
        String Category = intent.getExtras().getString("Category");
        int image = intent.getExtras().getInt("Thumbnail");
        int image2 = intent.getExtras().getInt("Thumbnail2");




        // Setting values

        tvtitle.setText(Title);
        tvdescription2.setText(Description2);
        tvdescription.setText(Description);
        tvcategory.setText(Category);
        img.setImageResource(image);
        img2.setImageResource(image2);
    }
}