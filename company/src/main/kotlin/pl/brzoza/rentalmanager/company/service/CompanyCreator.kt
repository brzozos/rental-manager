package pl.brzoza.rentalmanager.company.service

import org.springframework.stereotype.Service
import pl.brzoza.rentalmanager.company.model.CompanyView
import pl.brzoza.rentalmanager.company.model.ObjectId
import java.util.UUID

@Service
class CompanyCreator {

    fun createCompany(): ObjectId {
        return ObjectId(
            id = UUID.randomUUID().toString(),
            version = 1L
        )
    }

    fun getById(id: String): CompanyView {
        return CompanyView(
            id = UUID.randomUUID().toString(),
            name =  "Random company name"
        )
    }
}