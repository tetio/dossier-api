package net.portic.mypcs.dossier.service;

import net.portic.mypcs.dossier.entity.Company;
import net.portic.mypcs.dossier.entity.CompanyDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import net.portic.mypcs.dossier.repository.CompanyRepository;

import java.util.List;

import static java.util.stream.Collectors.toList;
/**
 * Created by tetio on 14/10/15.
 */
@Service
public final class MongoDBCompanyService implements CompanyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MongoDBCompanyService.class);

    private final CompanyRepository repository;

    @Autowired
    public MongoDBCompanyService(CompanyRepository repository) {
        this.repository = repository;
    }


    @Override
    public CompanyDTO create(CompanyDTO company) {
        return null;
    }

    @Override
    public CompanyDTO delete(String id) {
        return null;
    }

    @Override
    public List<CompanyDTO> findAll() {
        return repository.findAll().stream().map(this::convertToDTO).collect(toList());
    }

    @Override
    public CompanyDTO findById(String id) {
        return null;
    }

    @Override
    public CompanyDTO findByCode(String code) {
        return null;
    }

    @Override
    public CompanyDTO update(CompanyDTO company) {
        return null;
    }

    private CompanyDTO convertToDTO(Company model) {
        CompanyDTO dto = new CompanyDTO();

        dto.setAddress(model.getAddress());
        dto.setAddress_title(model.getAddress_title());
        dto.setCity(model.getCity());
        dto.setCode(model.getCode());
        dto.setCity(model.getCity());
        dto.setCountry(model.getCountry());
        dto.setEmail(model.getEmail());
        dto.setFax(model.getFax());
        dto.setName(model.getName());
        dto.setLast_modification(model.getLast_modification());

        return dto;
    }
}
