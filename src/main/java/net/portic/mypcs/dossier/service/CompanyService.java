package net.portic.mypcs.dossier.service;

import net.portic.mypcs.dossier.entity.CompanyDTO;

import java.util.List;

/**
 * Created by tetio on 14/10/15.
 */
public interface CompanyService {
    CompanyDTO create(CompanyDTO company);

    CompanyDTO delete(String id);

    List<CompanyDTO> findAll();

    CompanyDTO findById(String id);

    CompanyDTO findByCode(String code);

    CompanyDTO update(CompanyDTO company);
}
