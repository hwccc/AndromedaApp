package org.qiyi.video.svg.utils;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import org.qiyi.video.svg.Andromeda;
import org.qiyi.video.svg.broadcast.BroadcastUtil;
import org.qiyi.video.svg.config.BroadcastConstants;
import org.qiyi.video.svg.config.DispatcherConstants;
import org.qiyi.video.svg.transfer.RemoteTransfer;

public class BaseProcessUtil {

    protected final String TAG = getClass().getSimpleName();

    protected Context context;

    /**
     * 初始化
     *
     * @param context
     */
    public void init(Context context) {
        this.context = context;
        Andromeda.init(context);
    }

    /**
     * 启动监听是否重启启动
     */
    public void startMonitorRestart() {
        BroadcastUtil.getInstance().register(context);
    }


    /**
     * 停止监听是否重启启动
     */
    public void stopMonitorRestart() {
        BroadcastUtil.getInstance().unregister();
    }

    /**
     * 注册服务
     *
     * @param serviceClass
     * @param stubBinder
     * @param <T>
     */
    public <T extends IBinder> void registerSpeechRemoteService(Class serviceClass, T stubBinder) {

    }

    /**
     * 注册服务
     *
     * @param isMonitorRestart
     * @param serviceClass
     * @param stubBinder
     * @param <T>
     */
    public <T extends IBinder> void registerSpeechRemoteService(boolean isMonitorRestart, Class serviceClass, T stubBinder) {

    }

    /**
     * 注册服务
     *
     * @param authority
     * @param serviceClass
     * @param stubBinder
     * @param <T>
     */
    public <T extends IBinder> void registerRemoteService(String authority, Class serviceClass, T stubBinder) {
        registerRemoteService(false, authority, serviceClass, stubBinder);
    }

    /**
     * 注册服务
     *
     * @param isMonitorRestart
     * @param authority
     * @param serviceClass
     * @param stubBinder
     * @param <T>
     */
    public <T extends IBinder> void registerRemoteService(boolean isMonitorRestart, String authority, Class serviceClass, T stubBinder) {
        RemoteTransfer.getInstance().setCurrentAuthority(authority);
        Andromeda.registerRemoteService(serviceClass, stubBinder);
        if (isMonitorRestart && context != null) {
            Intent intent = new Intent();
            intent.setAction(BroadcastConstants.PROCESS_COMMUNICATION_ACTION);
            intent.putExtra(BroadcastConstants.EXTRA_AUTHORITY, authority);
            context.sendBroadcast(intent);
        }
    }

    /**
     * 注销服务
     *
     * @param serviceClass
     */
    public void unregisterRemoteService(Class serviceClass) {
        Andromeda.unregisterRemoteService(serviceClass);
    }

}
