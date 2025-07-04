package com.claim.demo.service;

import com.claim.demo.dto.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NotificationService implements NotificationServiceI{
    @Autowired
    private KafkaTemplate<String, NotificationDTO> kafkaTemplate;

    private static final String NOTIFICATION_TOPIC = "user-notifications";
    private static final String UNSUBSCRIBE_TOPIC = "unsubscribe-notifications";

    @Autowired
    private EmailService emailService;

    public void subscribeToNotifications(Long userId, String message) {
        NotificationDTO notification = new NotificationDTO(null, userId, message, new Date());
        kafkaTemplate.send(NOTIFICATION_TOPIC, notification);
    }

    public void unsubscribeFromNotifications(Long userId) {
        NotificationDTO notification = new NotificationDTO(null, userId, "Unsubscribed", new Date());
        kafkaTemplate.send(UNSUBSCRIBE_TOPIC, notification);
    }
}
