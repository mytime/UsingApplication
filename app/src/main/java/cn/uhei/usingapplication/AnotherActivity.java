package cn.uhei.usingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AnotherActivity extends AppCompatActivity {
    private static final String TAG = "AnotherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        //获取全局对象
        MyApplication myApplication = (MyApplication) getApplication();

        //输出全局对象的属性值
        Log.i(TAG,String.valueOf(myApplication.ismHasPassword()));
    }
}
