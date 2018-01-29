package com.example.root.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Intent intent = getIntent();
        TourList information = intent.getParcelableExtra("information");

        String placeName = information.getPlaceName();
        String placeAddress = information.getPlaceAddress();
        int imageId = information.getImageID();

        TextView textViewOne = findViewById(R.id.info_text1);
        textViewOne.setText(placeName);

        TextView textViewTwo = findViewById(R.id.info_text2);
        textViewTwo.setText(placeAddress);

        ImageView imageView = findViewById(R.id.info_image);
        if (information.hasImageId()) {
            imageView.setImageResource(imageId);
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
    }
}
