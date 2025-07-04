package com.claim.demo.service;

public interface NotificationServiceI {
    void subscribeToNotifications(Long userId, String message);

    void unsubscribeFromNotifications(Long userId);
}
