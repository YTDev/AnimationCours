package com.example.animationcours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4;
    ImageView img;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btnFade);
        btn2=findViewById(R.id.btnScale);
        btn3=findViewById(R.id.btnRotate);
        btn4=findViewById(R.id.btnTranslate);
        img=findViewById(R.id.img);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFade:
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                break;
            case R.id.btnScale:
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                break;
            case R.id.btnRotate:
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                break;
            case R.id.btnTranslate:
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                break;
        }
        img.startAnimation(animation);
    }
}
