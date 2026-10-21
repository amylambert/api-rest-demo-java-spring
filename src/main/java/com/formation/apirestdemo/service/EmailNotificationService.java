package com.formation.apirestdemo.service;

import org.springframework.stereotype.Service;

@Service ("emailNotificationService")
public class EmailNotificationService implements NotificationService{
    public EmailNotificationService(){}

    public void notifier(String type, String message){
        System.out.println("email: " + type + ": " + message);
    }
}
