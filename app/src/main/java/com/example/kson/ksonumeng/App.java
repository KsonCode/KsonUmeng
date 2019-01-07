package com.example.kson.ksonumeng;

import android.app.Application;
import android.content.Context;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class App extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化各种第三方平台sdk
        mContext = this;
        initUmeng();
    }

    /**
     * 初始化umenng
     */
    private void initUmeng() {
        /*
注意: 即使您已经在AndroidManifest.xml中配置过appkey和channel值，也需要在App代码中调用初始化接口（如需要使用AndroidManifest.xml中配置好的appkey和channel值，UMConfigure.init调用中appkey和channel参数请置为null）。
*/
        UMConfigure.init(this, Contstans.UMENG_APP_KEY, "Umeng", UMConfigure.DEVICE_TYPE_PHONE, null);

        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
    }
}
