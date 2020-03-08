package kale.com.automailsenddemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import kale.com.automailsenddemo.helper.MessageHelper;

public class AlertReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        //Send Mail
        JavaMailAPI javaMailAPI = new JavaMailAPI(context,
                MessageHelper.email,MessageHelper.subject,MessageHelper.message,false);

        javaMailAPI.execute();
    }
}
