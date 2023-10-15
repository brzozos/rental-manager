package pl.brzoza.rentalmanager.company.model.notification.apartmentcreated

import pl.brzoza.rentalmanager.company.model.notification.Notification
import pl.brzoza.rentalmanager.company.model.notification.NotificationTopicEnum

data class ApartmentCreatedNotification(
    val apartmentId: String,
    val companyId: String,
    val name: String,
    val address: String,
)

fun create() {
    return ApartmentCreatedNotification(
        apartmentId = 'a',
        companyId = 'a',
    name = 'a',
    address = 'a',
    )
}