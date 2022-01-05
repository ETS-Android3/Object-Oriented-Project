package com.example.gamblinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Page3 extends AppCompatActivity {
    Button btm,randBtn;
    ImageView imageView1,imageView2,imageView3;
    Random r;
    Integer[] images1= {
            R.drawable.namtao,
            R.drawable.poo,
            R.drawable.pla,
            R.drawable.goog,
            R.drawable.tiger,
            R.drawable.kai
    };
    Integer[] images2= {
            R.drawable.namtao,
            R.drawable.poo,
            R.drawable.pla,
            R.drawable.goog,
            R.drawable.tiger,
            R.drawable.kai
    };
    Integer[] images3= {
            R.drawable.namtao,
            R.drawable.poo,
            R.drawable.pla,
            R.drawable.goog,
            R.drawable.tiger,
            R.drawable.kai
    };
    int pickedImage1 = 0,lastPicked1 = 0;
    int pickedImage2 = 0,lastPicked2 = 0;
    int pickedImage3 = 0,lastPicked3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        r = new Random();
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);

        do {

            pickedImage1 = r.nextInt(images1.length);
            pickedImage2 = r.nextInt(images2.length);
            pickedImage3 = r.nextInt(images3.length);
            //imageView.setImageResource(images[r.nextInt(images.length)]);

        } while (pickedImage1 == lastPicked1);
        lastPicked1 = pickedImage1;
        lastPicked2 = pickedImage2;
        lastPicked3 = pickedImage3;
        //display random image
        imageView1.setImageResource(images1[r.nextInt(images1.length)]);
        imageView2.setImageResource(images2[r.nextInt(images2.length)]);
        imageView3.setImageResource(images3[r.nextInt(images3.length)]);

        btm = findViewById(R.id.btmBtn);
        btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Page3.this,MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}













