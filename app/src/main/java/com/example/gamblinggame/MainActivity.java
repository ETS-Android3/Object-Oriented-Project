package com.example.gamblinggame;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

        import java.util.Arrays;
        import java.util.Collection;
        import java.util.Collections;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnTp3,btnTp2;

    int pickedImage1 = 0,lastPicked1 = 0;
    int pickedImage2 = 0,lastPicked2 = 0;
    int pickedImage3 = 0,lastPicked3 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTp2 = findViewById(R.id.HtpBtn);
        btnTp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),Page2.class);
                startActivity(intent1);
            }
        });

        btnTp3 = findViewById(R.id.randomBtn);

        btnTp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(getApplicationContext(),randomPage.class);

                startActivity(intent3);
            }

        });
    }
    public void clickexit(View v){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("คุณต้องการออกจากโปรแกรมนี้ ใช่ หรือ ไม่ ?");
        builder.setCancelable(true);
        builder.setNegativeButton("ใช่", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }

        });
        builder.setPositiveButton("ไม่", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}
