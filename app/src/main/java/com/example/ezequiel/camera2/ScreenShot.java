package com.example.ezequiel.camera2;

import android.graphics.Bitmap;
import android.view.View;

/**
 * Created by lenovo on 28-05-2018.
 */

public class ScreenShot {

    public static Bitmap takeScreenShot(View view){
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        Bitmap b = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return b;
    }

    public static Bitmap takeScreenshotOfRootView(View view){
        return takeScreenShot(view.getRootView());
    }
}
