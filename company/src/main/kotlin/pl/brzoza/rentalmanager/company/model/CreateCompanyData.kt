package pl.brzoza.rentalmanager.company.model

data class CreateCompanyData(
    val name: String,
    val address: String,
    val city: String,
    val postCode: String,
    val email: String,
    val phoneNumber: String,
)
