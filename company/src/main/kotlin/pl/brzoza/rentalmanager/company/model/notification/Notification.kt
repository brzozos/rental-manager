package pl.brzoza.rentalmanager.company.model.notification

interface Notification<TBody> {
    val topic: NotificationTopicEnum
    val header: Header
    val body: TBody
}
