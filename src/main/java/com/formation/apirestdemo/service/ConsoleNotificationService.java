package com.formation.apirestdemo.service;

import org.springframework.stereotype.Service;

@Service ("consoleNotificationService")
public class ConsoleNotificationService implements NotificationService {
    public ConsoleNotificationService(){}

    public void notifier(String type, String message){
        System.out.println("console: " + type + ": " + message);
    }
}
