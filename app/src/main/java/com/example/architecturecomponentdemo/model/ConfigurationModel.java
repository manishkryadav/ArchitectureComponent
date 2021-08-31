package com.example.architecturecomponentdemo.model;

import java.io.Serializable;

public class ConfigurationModel implements Serializable {

    private String result;
    private String message;
    private DataBean data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        private Integer visitors_limit;
        private String user_android_version;
        private Boolean user_android_mandatory_update;
        private Boolean user_android_under_maintenance;
        private String user_ios_version;
        private Boolean user_ios_mandatory_update;
        private Boolean user_ios_under_maintenance;
        private Boolean app_update;
        private String app_update_text;
        private String app_under_maintenance_text;
        private String app_type;
        private Boolean qr_code_from_backend_api;
        private String privacy_policy;
        private String terms_condition;
        private String privacy_policy_text;
        private String terms_condition_text;
        private String user_android_url;
        private String user_ios_url;
        private String user_webapp_url;

        public Integer getVisitors_limit() {
            return visitors_limit;
        }

        public void setVisitors_limit(Integer visitors_limit) {
            this.visitors_limit = visitors_limit;
        }

        public String getUser_android_version() {
            return user_android_version;
        }

        public void setUser_android_version(String user_android_version) {
            this.user_android_version = user_android_version;
        }

        public Boolean getUser_android_mandatory_update() {
            return user_android_mandatory_update;
        }

        public void setUser_android_mandatory_update(Boolean user_android_mandatory_update) {
            this.user_android_mandatory_update = user_android_mandatory_update;
        }

        public Boolean getUser_android_under_maintenance() {
            return user_android_under_maintenance;
        }

        public void setUser_android_under_maintenance(Boolean user_android_under_maintenance) {
            this.user_android_under_maintenance = user_android_under_maintenance;
        }

        public String getUser_ios_version() {
            return user_ios_version;
        }

        public void setUser_ios_version(String user_ios_version) {
            this.user_ios_version = user_ios_version;
        }

        public Boolean getUser_ios_mandatory_update() {
            return user_ios_mandatory_update;
        }

        public void setUser_ios_mandatory_update(Boolean user_ios_mandatory_update) {
            this.user_ios_mandatory_update = user_ios_mandatory_update;
        }

        public Boolean getUser_ios_under_maintenance() {
            return user_ios_under_maintenance;
        }

        public void setUser_ios_under_maintenance(Boolean user_ios_under_maintenance) {
            this.user_ios_under_maintenance = user_ios_under_maintenance;
        }

        public Boolean getApp_update() {
            return app_update;
        }

        public void setApp_update(Boolean app_update) {
            this.app_update = app_update;
        }

        public String getApp_update_text() {
            return app_update_text;
        }

        public void setApp_update_text(String app_update_text) {
            this.app_update_text = app_update_text;
        }

        public String getApp_under_maintenance_text() {
            return app_under_maintenance_text;
        }

        public void setApp_under_maintenance_text(String app_under_maintenance_text) {
            this.app_under_maintenance_text = app_under_maintenance_text;
        }

        public String getApp_type() {
            return app_type;
        }

        public void setApp_type(String app_type) {
            this.app_type = app_type;
        }

        public Boolean getQr_code_from_backend_api() {
            return qr_code_from_backend_api;
        }

        public void setQr_code_from_backend_api(Boolean qr_code_from_backend_api) {
            this.qr_code_from_backend_api = qr_code_from_backend_api;
        }

        public String getPrivacy_policy() {
            return privacy_policy;
        }

        public void setPrivacy_policy(String privacy_policy) {
            this.privacy_policy = privacy_policy;
        }

        public String getTerms_condition() {
            return terms_condition;
        }

        public void setTerms_condition(String terms_condition) {
            this.terms_condition = terms_condition;
        }

        public String getPrivacy_policy_text() {
            return privacy_policy_text;
        }

        public void setPrivacy_policy_text(String privacy_policy_text) {
            this.privacy_policy_text = privacy_policy_text;
        }

        public String getTerms_condition_text() {
            return terms_condition_text;
        }

        public void setTerms_condition_text(String terms_condition_text) {
            this.terms_condition_text = terms_condition_text;
        }

        public String getUser_android_url() {
            return user_android_url;
        }

        public void setUser_android_url(String user_android_url) {
            this.user_android_url = user_android_url;
        }

        public String getUser_ios_url() {
            return user_ios_url;
        }

        public void setUser_ios_url(String user_ios_url) {
            this.user_ios_url = user_ios_url;
        }

        public String getUser_webapp_url() {
            return user_webapp_url;
        }

        public void setUser_webapp_url(String user_webapp_url) {
            this.user_webapp_url = user_webapp_url;
        }
    }
}
