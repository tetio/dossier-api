package net.portic.mypcs.dossier.entity;

import java.sql.Date;

/**
 * Created by tetio on 14/10/15.
 */
public final class CompanyDTO {
    private String code;
    private String name;
    private String web;
    private String email;
    private String address_title;
    private String address;
    private String city;
    private String region;
    private String postal_code;
    private String country;
    private String phone;
    private String fax;
    private String situation;
    private Date last_modification;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress_title() {
        return address_title;
    }

    public void setAddress_title(String address_title) {
        this.address_title = address_title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Date getLast_modification() {
        return last_modification;
    }

    public void setLast_modification(Date last_modification) {
        this.last_modification = last_modification;
    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", web='" + web + '\'' +
                ", email='" + email + '\'' +
                ", address_title='" + address_title + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", situation='" + situation + '\'' +
                ", last_modification=" + last_modification +
                '}';
    }
}
