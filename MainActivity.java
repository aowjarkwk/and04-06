package com.example.ex04_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1. 0~9까지의 문자가 들어오면, 숫자 배열에 넣고, (일단 한자리수만 계산)
//2. + - * / 문자가 들어오면, 연산자 배열에 넣고,
//3. C문자가 들어오면 클리어,
//4. =문자가 들어오면 계산하기
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);


    }
    //버튼 16개 이벤트 리스너
    public void onButton(View v){
        Button btn = (Button)v;
        String strTitle = btn.getText().toString();
        Log.e("MainActivity","onButton:"+strTitle);

        process(strTitle);
    }
    static ArrayList<Integer> in_nums = new ArrayList<Integer>();
    static ArrayList<String> ops = new ArrayList<String>();
    void process(String strTitle){
        char ch = strTitle.charAt(0);
        //숫자인가?
        if(ch>='0'&& ch<='9'){
            in_nums.add(new Integer((int)(ch-'0')));
            Log.e("MainActivity",in_nums.toString());
    }
        //연산자인가?
        else if(ch =='+'||ch=='-'||ch=='*'||ch=='/'){
            ops.add(strTitle);
            Log.e("MainActivity",ops.toString());
        }
        //Clear인가?
        else if(ch =='C'){
            in_nums.clear();
            ops.clear();
            textView.setText("계산식");
        }
        // =인가?
        else if(ch == '='){
            //계산하기
            //ex)3 + 4 - 2 * 3=
            double result = in_nums.get(0).doubleValue();
            int num2;
            char op;
            for(int i=0;i<ops.size();i++){
                op = ops.get(i).charAt(0);
                num2 = in_nums.get(i+1).intValue();
                if(op == '+'){
                    result +=in_nums.get(i+1).intValue();
                }else if(op =='-'){
                    result -=in_nums.get(i+1).intValue();
                }else if(op =='*'){
                    result *=in_nums.get(i+1).intValue();
                }else if(op=='/'){
                    result /=in_nums.get(i+1).intValue();
                }

            }
            Log.e("MainActivity","결과값:"+result);
            textView.setText("결과값:"+result);
        }

    }
}
