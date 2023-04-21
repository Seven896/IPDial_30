package com.zyy.ipdial_30;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OutGoingCallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("-------------------------call");
    }
}