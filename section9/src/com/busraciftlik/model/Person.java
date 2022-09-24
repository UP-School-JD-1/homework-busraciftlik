package com.busraciftlik.model;

import java.util.Objects;

public class Person implements Comparable<Person>{
    String firstName;
    String lastName;
    Address address;
    String phoneNumber;

    public Person(String firstName, String lastName, Address address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address) && Objects.equals(phoneNumber, person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, phoneNumber);
    }

    @Override
    public int compareTo(Person o) {
        String other = o.lastName.toLowerCase();
        String thisPerson = this.lastName.toLowerCase();
        int diff=other.charAt(0)-thisPerson.charAt(0);

        if(diff>0){
            return  -1;
        } else if (diff<0) {
            return 1;
        }else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
