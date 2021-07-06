package com.study.ex06_loginjoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editTextID;
    EditText editTextPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextID=findViewById(R.id.editTextID);
        editTextPW=findViewById(R.id.editTextPW);
    }
    public void onButtonLogin(View v){
        String id = editTextID.getText().toString();
        String pw = editTextPW.getText().toString();

        //서버에 아이디,암호를 전송해서 로그인 결과를 얻어옴.

        //로그인 성공!
        MyApplication.isLogin=true;
        MyApplication.userid = id;
        MyApplication.userpw = pw;
        Toast.makeText(this,"로그인되었습니다.",Toast.LENGTH_LONG).show();
        finish(); //뒤로가기
    }
    public void onButtonJoin(View v){
        Intent i = new Intent(this,AgreeActivity.class);
        startActivity(i);
    }
}