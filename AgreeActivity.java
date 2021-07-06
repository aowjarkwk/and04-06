package com.study.ex06_loginjoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class AgreeActivity extends AppCompatActivity {
    CheckBox checkBoxAgree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agree);
        checkBoxAgree = findViewById(R.id.checkBoxAgree);

    }
    public void onButtonJoin(View v){
        if(!checkBoxAgree.isChecked()){
            Toast.makeText(this, "약관에 동의해주세요", Toast.LENGTH_LONG).show();
            return;
        }
        Intent i = new Intent(this,JoinActivity.class);
        startActivity(i);
    }
}