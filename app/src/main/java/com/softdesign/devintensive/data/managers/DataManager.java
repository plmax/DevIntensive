package com.softdesign.devintensive.data.managers;


public class DataManager {
    private static DataManager INSTANCE = null;


    private PreferencesManager mPreferencesManager;

    private DataManager() {
        this.mPreferencesManager = new PreferencesManager();
    }

    public static DataManager getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public PreferencesManager getPreferencesManager() {
        return mPreferencesManager;
    }
}
