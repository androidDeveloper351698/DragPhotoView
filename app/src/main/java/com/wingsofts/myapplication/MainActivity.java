package com.wingsofts.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    private float mImgHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.imageView);
    }

    public void onClick(View view){
        DragPhotoActivity.startActivity(this,mImageView);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {


        super.onWindowFocusChanged(hasFocus);
    }
}
