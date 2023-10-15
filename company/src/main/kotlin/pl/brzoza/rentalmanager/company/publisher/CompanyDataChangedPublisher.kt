package pl.brzoza.rentalmanager.company.publisher

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import pl.brzoza.rentalmanager.company.model.notification.Notification

@Service
class CompanyDataChangedPublisher(
    val kafkaTemplate: KafkaTemplate<String, Notification>
) {

    fun publish() {

    }
}