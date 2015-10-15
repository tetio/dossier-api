package net.portic.mypcs.dossier.entity;

import org.springframework.data.annotation.Id;

import java.sql.Date;

/**
 * Created by tetio on 14/10/15.
 */
public final class Company {
    @Id
    private String code;
    private String name;
//    primary_contact; {
//        title;
//                first_name;
//                middle_name;
//                last_name;
//                mobile;
//                phone_home;
//                email;
//    },
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
//    services; [{
//        service_code;
//                valid_from; Date,
//                valid_to; Date
//    }]


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

    static class Builder {
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

        private Builder() {}

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder web(String web) {
            this.web = web;
            return this;
        }

        Builder email(String email) {
            this.email = email;
            return this;
        }

        Builder address_title(String address_title) {
            this.address_title = address_title;
            return this;
        }

        Builder address(String address) {
            this.address = address;
            return this;
        }

        Builder city(String city) {
            this.city = city;
            return this;
        }

        Builder region(String region) {
            this.region = region;
            return this;
        }

        Builder postal_code(String postal_code) {
            this.postal_code = postal_code;
            return this;
        }

        Builder country(String country) {
            this.country = country;
            return this;
        }

        Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        Builder fax(String fax) {
            this.fax = fax;
            return this;
        }

        Builder situation(String situation) {
            this.situation = situation;
            return this;
        }

        Builder last_modification(Date last_modification) {
            this.last_modification = last_modification;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Company{" +
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
