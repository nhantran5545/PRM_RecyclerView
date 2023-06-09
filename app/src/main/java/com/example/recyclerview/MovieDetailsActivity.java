package com.example.recyclerview;

import android.os.Bundle;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MovieDetailsActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textViewName;
    private TextView textViewYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        // Ánh xạ các thành phần UI
        imageView = findViewById(R.id.image_poster);
        textViewName = findViewById(R.id.text_phim);
        textViewYear = findViewById(R.id.text_year);

        // Nhận dữ liệu phim từ intent
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String year = intent.getStringExtra("year");
            int poster = intent.getIntExtra("poster", 0);

            // Hiển thị dữ liệu phim trong các thành phần UI
            imageView.setImageResource(poster);
            textViewName.setText(name);
            textViewYear.setText(year);
        }
    }
}
