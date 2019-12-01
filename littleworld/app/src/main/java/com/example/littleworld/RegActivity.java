package com.example.littleworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
            Date:
            2019/12/1   注册界面xml界面+java代码调整头像显示为圆形
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        //加入从数据库中找到头像的方法，并存入drawable里面的defaultSculp.jpg

        //裁剪头像为圆形
        ImageView sculpture=findViewById(R.id.sculpture);
        sculpture.setImageResource(R.drawable.default_sculp);
        sculpture.setElevation(20f);
        sculpture.setClipToOutline(true);
        sculpture.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setOval(0,0,view.getWidth(), view.getHeight());
            }
        });
    }
}