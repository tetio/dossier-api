package net.portic.mypcs.dossier.controller;

import net.portic.mypcs.dossier.entity.CompanyDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import net.portic.mypcs.dossier.service.CompanyService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tetio on 14/10/15.
 */
@RestController
@EnableAutoConfiguration
public class CompanyController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyController.class);
    private final CompanyService service;

    @Autowired
    public CompanyController(CompanyService service) {
        this.service = service;
    }


    @RequestMapping("/")
    @ResponseBody
    public String homeRoot() {
        return "Hello World!";
    }

    @RequestMapping("/net/portic/mypcs/dossier/api")
    @ResponseBody
    public String homeApi() {
        return "Hello World API!";
    }

    @RequestMapping(value = "/net/portic/mypcs/dossier/api/company", method = RequestMethod.GET)
    @ResponseBody
    public List<CompanyDTO> findAll() {
        LOGGER.info("findAll companies");
        List<CompanyDTO> companyEntries = service.findAll();
        LOGGER.info("Found {} companies", companyEntries.size());
        return companyEntries;
    }

}
