package com.example.taskoneinternal;

import android.content.Context;
import android.widget.Toast;

public class Utils {
    public static void fireToast(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
