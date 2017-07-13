package com.example.baker.permissiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import static com.example.baker.permissiontest.PermissionConstantsWrapper.*;    // 自作クラス。



public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // 利用側は PermissionRequester.request の一行で済むように書いた。
    public void onClickButtonA(View view){
        System.out.println("Pressed ButtonA");
        PermissionRequester.request(this, Permission.ACCESS_FINE_LOCATION);
    }


    public void onClickButtonB(View view){
        System.out.println("Pressed ButtonB");
    }


    public void onClickButtonC(View view){
        System.out.println("Pressed ButtonC");
    }


    public void onClickButtonD(View view){
        System.out.println("Pressed ButtonD");
    }


    public void onClickButtonE(View view){
        System.out.println("Pressed ButtonE");
    }
}
