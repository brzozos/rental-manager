package pl.brzoza.rentalmanager.company.listener

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class ApartmentListener {

    @KafkaListener(
        id = "company-service",
        topics = ["brzoza.rentalmanager.create.company"]
    )
    fun apartmentCreatedNotification(notification: ApartmentCreatedNotification) {
        val a = 's'
    }
}