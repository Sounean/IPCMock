package com.example.ipcmock;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

/**
 * @Author : Sounean
 * @Time : On 2022-08-30 7:22
 * @Description : XService
 * @Warn :
 */
class XService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
