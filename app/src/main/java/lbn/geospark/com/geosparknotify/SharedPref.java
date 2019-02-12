package lbn.geospark.com.geosparknotify;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {

    private static String PREFS = "";

    public static void setToken(Context context, String token) {
        SharedPreferences sp = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("DEVICETOKEN", token);
        editor.apply();
        editor.commit();
    }


    public static String getToken(Context context) {
        SharedPreferences sp = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        return sp.getString("DEVICETOKEN", null);
    }

}
