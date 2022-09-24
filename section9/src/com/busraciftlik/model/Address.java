package com.busraciftlik.model;

import java.util.Objects;

public class Address {
    String city;
    String country;
    String zipCode;
    int no;

    public Address(String city, String country, String zipCode, int no) {
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.no = no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return no == address.no && Objects.equals(city, address.city) && Objects.equals(country, address.country) && Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, zipCode, no);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", no=" + no +
                '}';
    }
}
