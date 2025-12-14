package org.mpt.webapp.services.company;

import org.mpt.webapp.models.company.CompanyType;
import org.mpt.webapp.repositories.company.CompanyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyTypeService {

    @Autowired
    private CompanyTypeRepository companyTypeRepository;

    // Get all company types
    public List<CompanyType> getAllCompanyTypes() {
        return companyTypeRepository.findAll();
    }

    // Get company type by ID
    public Optional<CompanyType> getCompanyTypeById(Long companyTypeId) {
        return companyTypeRepository.findById(companyTypeId);
    }

    // Create or update a company type
    public CompanyType saveCompanyType(CompanyType companyType) {
        return companyTypeRepository.save(companyType);
    }

    // Delete a company type by ID
    public void deleteCompanyType(Long companyTypeId) {
        companyTypeRepository.deleteById(companyTypeId);
    }
}