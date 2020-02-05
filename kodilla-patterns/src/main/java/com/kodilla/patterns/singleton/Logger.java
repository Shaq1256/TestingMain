package com.kodilla.patterns.singleton;

public class Logger {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String lastLog = "";

    private Logger() {

    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}