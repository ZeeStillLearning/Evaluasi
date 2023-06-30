package com.fauziy.biomastery_evakuasi;

import android.app.Application;

public class MyApp extends Application {
    private static int score;

    @Override
    public void onCreate() {
        super.onCreate();
        score = 0;
    }

    public static void incrementScore(int points) {
        score += points;
    }

    public static int getScore() {
        return score;
    }
}