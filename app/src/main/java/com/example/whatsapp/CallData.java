package com.example.whatsapp;

import com.example.whatsapp.databinding.ItemCallsLayoutBinding;

public class CallData {
    private String callerName;
    private String callTime;
    private int callImage;

    public CallData(String callerName, String callTime, int callImage) {
        this.callerName = callerName;
        this.callTime = callTime;
        this.callImage = callImage;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getCallTime() {
        return callTime;
    }

    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }

    public int getCallImage() {
        return callImage;
    }

    public void setCallImage(int callImage) {
        this.callImage = callImage;
    }
}
