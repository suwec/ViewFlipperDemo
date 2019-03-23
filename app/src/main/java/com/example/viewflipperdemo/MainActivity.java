package com.example.viewflipperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView rv1,rv2;
    private ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv1 = findViewById(R.id.iv1);
        rv2 = findViewById(R.id.iv2);
        vf = findViewById(R.id.vf);
        rv1.setOnClickListener(this);
        rv2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv1:
                vf.showNext();
                break;
            case R.id.iv2:
                vf.showPrevious();
                break;
        }
    }
}
