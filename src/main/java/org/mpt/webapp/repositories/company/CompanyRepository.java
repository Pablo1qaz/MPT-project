package org.mpt.webapp.repositories.company;

import org.mpt.webapp.models.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    public Company findByContactEmail(String contactEmail);

    public List<Company> findByCompanyTypeType(String type);
}