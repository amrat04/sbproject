package com.test.sbproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int addressid;

    @Column(name="street1")
    String street1;

    @Column(name="city")
    String city;

    public Address(int addressid, String street1, String city) {
        this.addressid = addressid;
        this.street1 = street1;
        this.city = city;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
