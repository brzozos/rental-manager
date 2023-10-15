package pl.brzoza.rentalmanager.company.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import pl.brzoza.rentalmanager.company.mapper.CompanyResponseMapper
import pl.brzoza.rentalmanager.company.model.request.CreateCompanyRequest
import pl.brzoza.rentalmanager.company.model.response.GetCompanyResponse
import pl.brzoza.rentalmanager.company.service.CompanyCreator

@RestController("api/company")
class CompanyController(
    private val companyCreator: CompanyCreator,
    private val companyResponseMapper: CompanyResponseMapper
) {

    @PutMapping
    fun createCompany(@RequestBody request: CreateCompanyRequest): ResponseEntity<Any> {
        val company = companyCreator.createCompany()
        return ResponseEntity.created(
            ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(company.id)
                .toUri()
        ).build()
    }

    @GetMapping
    fun getCompanyById(@PathVariable id: String): ResponseEntity<GetCompanyResponse> {
        val company = companyCreator.getById(id)
        val response = companyResponseMapper.mapToResponse(company)
        return ResponseEntity.ok(response)
    }
}