package pl.brzoza.rentalmanager.company.publisher

import org.springframework.kafka.core.KafkaTemplate
import pl.brzoza.rentalmanager.company.model.notification.Notification
import pl.brzoza.rentalmanager.company.model.notification.NotificationTopicEnum

abstract class Publisher<TNotification>(
    private val kafkaTemplate: KafkaTemplate<NotificationTopicEnum, TNotification>
) {

    fun send(notification: TNotification) {

    }
}