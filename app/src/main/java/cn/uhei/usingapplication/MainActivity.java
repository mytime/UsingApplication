package cn.uhei.usingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:

                //获取全局对象
                MyApplication myApplication = (MyApplication) getApplication();
                Log.i(TAG, String.valueOf(myApplication.ismHasPassword()));

                //改变全局对象属性mHasPassword的状态，
                myApplication.setmHasPassword(false);

                Intent intent = new Intent(this,AnotherActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
