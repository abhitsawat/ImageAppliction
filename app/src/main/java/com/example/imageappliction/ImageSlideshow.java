package com.example.imageappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ImageSlideshow extends AppCompatActivity {
    //define the index and the array of imges
    int index = 0;
    // images array will store image ID
    int[] images = new int[]{R.drawable.image_one, R.drawable.image_two, R.drawable.image_three, R.drawable.image_four};

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slideshow);
    }


    public void Slide(View view) {
        //define the imageView Slide
        imageView = findViewById(R.id.imageView4);

        //change the Image When The Button Clcik
        Animation animationq = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_show);
        imageView.startAnimation(animationq);

        imageView.setImageResource(images[index]);
        index++;

        //reset the index to 0
        if (index == images.length) {
            index = 0;
        }

    }
}
