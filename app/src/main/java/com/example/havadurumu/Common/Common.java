package com.example.havadurumu.Common;

import android.location.Location;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Common {
    public static final String APP_ID="20c5115ed36871ad9cea3532fdd2fd5b";
    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd EEE MM yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        String formatted = sdf.format(date);
        return formatted;
    }
}
