package com.study.ex06_loginjoin;

import android.app.Application;
//Application클래스: 앱이 실행되면 자동으로 생성됨.
public class MyApplication extends Application {
    //전역변수를 선언함.
    public static boolean isLogin = false;
    public static String userid = "";
    public static String userpw = "";
    public static String username = "";
    public static String userphone = "";

}
