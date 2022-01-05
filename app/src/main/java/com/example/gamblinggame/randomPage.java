package com.example.gamblinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.cunoraz.gifview.library.GifView;

public class randomPage extends AppCompatActivity {
    GifView gifView;
    Button showRand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_page);
        gifView = findViewById(R.id.gifView);
        showRand = findViewById(R.id.showRand);
        gifView.play();
        showRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifView.pause();
                Intent toPage3 = new Intent(getApplicationContext(),Page3.class);

                startActivity(toPage3);
            }
        });
    }
}
