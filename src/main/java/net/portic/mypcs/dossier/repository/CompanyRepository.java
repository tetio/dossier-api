package net.portic.mypcs.dossier.repository;

import net.portic.mypcs.dossier.entity.Company;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by tetio on 14/10/15.
 */
public interface CompanyRepository extends Repository<Company, String> {

    void delete(Company deleted);
    List<Company> findAll();
    Optional<Company> findOne(String id);
    Optional<Company> findByCode(String code);
    Company save(Company saved);
}
