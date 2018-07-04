package com.example.ezequiel.camera2;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClassificationMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classification);

        Button genderbtn = (Button)findViewById(R.id.genderbtn);
        Button emotionbtn = (Button)findViewById(R.id.emotionbtn);

        genderbtn.setOnClickListener(this);
        emotionbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id==R.id.genderbtn){
            Intent intent = new Intent(ClassificationMainActivity.this,MainActivity.class);
            intent.putExtra(MainActivity.CLASSFIER_TYPE,"gender");
            startActivity(intent);
//            finish();
        }
        else if(id==R.id.emotionbtn){
            Intent intent = new Intent(ClassificationMainActivity.this,MainActivity.class);
            intent.putExtra(MainActivity.CLASSFIER_TYPE,"emotion");
            startActivity(intent);
//            finish();
        }
    }
}
