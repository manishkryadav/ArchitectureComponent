package com.example.architecturecomponentdemo.api;

public class ConfigreBody {
    String app_type;
    String app_version;

    public ConfigreBody(String app_type, String app_version) {
        this.app_version = app_version;
        this.app_type = app_type;
    }

}
