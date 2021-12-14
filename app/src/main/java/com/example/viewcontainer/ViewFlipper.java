package com.example.viewcontainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViewFlipper extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewflipper);

        Button btnStart, btnStop;
        final android.widget.ViewFlipper vFlipper; //내부클래스 안에서 vFlipper에 접근해야하므로 final사용

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        vFlipper = (android.widget.ViewFlipper) findViewById(R.id.viewFlipper);

        vFlipper.setFlipInterval(1000); //1초단위 설정

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //vFlipper.showPrevious(); //이전화면보여주기
                vFlipper.startFlipping();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //vFlipper.showNext(); //다음화면보여주기
                vFlipper.stopFlipping();

                Intent intent = new Intent(getApplicationContext(),TabHost.class);
                startActivity(intent);
            }
        });

    }
}