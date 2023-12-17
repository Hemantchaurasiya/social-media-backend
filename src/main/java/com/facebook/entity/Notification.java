package com.facebook.entity;

import java.sql.Time;

public class Notification {
    private String notificationId;
    private String userId;
    private String description;
    private String notificationType;
    private boolean seen;
    private Time timestamp;
}
