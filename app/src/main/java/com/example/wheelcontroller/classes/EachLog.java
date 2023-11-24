package com.example.wheelcontroller.classes;

public class EachLog {

    private final String type;
    private final String message;
    private final String timestamp;

    public EachLog(String type, String message, String timestamp) {
        this.type = type;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public boolean allEquals(EachLog log){
        return type.equals(log.type) && message.equals(log.message) && timestamp.equals(log.timestamp);
    }

}
