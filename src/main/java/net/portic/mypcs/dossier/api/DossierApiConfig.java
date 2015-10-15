package net.portic.mypcs.dossier.api;

import hello.SampleController;
import net.portic.mypcs.dossier.controller.CompanyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tetio on 14/10/15.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DossierApiConfig {
    public static void main(String[] args) {
        SpringApplication.run(CompanyController.class, args);
    }
}
