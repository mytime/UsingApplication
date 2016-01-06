package cn.uhei.usingapplication;

import android.app.Application;

/**
 * Application 全局类
 * AndroidManifest.xml里面注册<application>.MyApplication</application>
 * 这样做的目的：App的进程被创建的时候，这个类就会被实例化，onCreate方法就会被执行，给所有全局变量赋初期值。
 这样，所有的Activity就共同拥有这个类里面的变量了。
 */
public class MyApplication extends Application {
    private boolean mHasPassword;

    public boolean ismHasPassword() {
        return mHasPassword;
    }

    public void setmHasPassword(boolean mHasPassword) {
        this.mHasPassword = mHasPassword;
    }

    @Override
    public void onCreate() {

        mHasPassword = true;
        super.onCreate();

    }


}
