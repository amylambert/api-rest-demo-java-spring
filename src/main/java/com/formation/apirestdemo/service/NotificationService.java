package com.formation.apirestdemo.service;

import org.springframework.stereotype.Service;

@Service 
public interface NotificationService {
    public void notifier(String type, String message);
}
