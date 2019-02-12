package lbn.geospark.com.geosparknotify;

import android.content.SharedPreferences;
import android.util.Log;

import com.geospark.lib.GeoSpark;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.io.IOException;

public class MyFireBase extends FirebaseMessagingService {


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("MESSAGE ",remoteMessage.getData().toString());
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.e("TOKEN", token);
        GeoSpark.setDeviceToken(this, token);
        SharedPref.setToken(this,token);
    }
}
