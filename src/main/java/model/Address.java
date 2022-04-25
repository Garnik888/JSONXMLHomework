package model;

import java.util.Objects;

public class Address {

    private  String city;
    private String country;
    private String street;
    private String postalCode;

    public Address() {

    }

    public Address(String city, String country, String street, String postalCode) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return postalCode == address.postalCode && Objects.equals(city, address.city) && Objects.equals(country, address.country) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, street, postalCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
