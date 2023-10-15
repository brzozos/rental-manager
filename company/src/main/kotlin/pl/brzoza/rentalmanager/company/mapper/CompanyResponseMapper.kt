package pl.brzoza.rentalmanager.company.mapper

import org.springframework.stereotype.Service
import pl.brzoza.rentalmanager.company.model.CompanyView
import pl.brzoza.rentalmanager.company.model.response.GetCompanyResponse

@Service
class CompanyResponseMapper {
    fun mapToResponse(company: CompanyView): GetCompanyResponse {
        return GetCompanyResponse(
            id = company.id,
            name = company.name
        )
    }
}