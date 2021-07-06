package com.study.ex06_loginjoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewStatus;
    //onCreate : 액티비티 생성시 자동으로 한번만 호출되는 함수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStatus = findViewById(R.id.textViewStatus);
        Log.e("Main",String.valueOf(MyApplication.isLogin));


    }
    //화면에 다시 나타날때 호출되는 함수

    @Override
    protected void onResume() {
        super.onResume(); //부모클래스 생성자를 호출해서 초기화루틴을 수행해줌.
        if(MyApplication.isLogin==true){
            textViewStatus.setText("로그인상태:로그인됨");
        }else{
            textViewStatus.setText("로그인상태:로그오프됨");
        }

    }
    public void onButtonLogin(View v){
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }
}