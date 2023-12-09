package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.BloodGroup;
import org.example.schoolMangement.enums.Gender;
import org.example.schoolMangement.enums.Genotype;

import java.time.LocalDate;
import java.util.Objects;

public abstract class User {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
    // then press Enter. You can now see whitespace characters in your code.

    private String firstName;
    private String lastName;
    private long phoneNumber;
    private  String address;
    private String email;
    private Gender gender;
    private LocalDate dateOfbirth;


    public User(String name, int age) {

    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String name) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private String stateOfOrigin;
    private String localGovernmentOforigin;
    private  String NextOfKin;
    private long nextOfkinphone;
    private BloodGroup BloodGroup;
    private Genotype genotype;
    private String underlyingAilment;

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getLocalGovernmentOforigin() {
        return localGovernmentOforigin;
    }

    public void setLocalGovernmentOforigin(String localGovernmentOforigin) {
        this.localGovernmentOforigin = localGovernmentOforigin;
    }

    public String getNextOfKin() {
        return NextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        NextOfKin = nextOfKin;
    }

    public long getNextOfkinphone() {
        return nextOfkinphone;
    }

    public void setNextOfkinphone(long nextOfkinphone) {
        this.nextOfkinphone = nextOfkinphone;
    }

    public BloodGroup getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public Genotype getGenotype() {
        return genotype;
    }

    public void setGenotype(Genotype genotype) {
        this.genotype = genotype;
    }

    public String getUnderlyingAilment() {
        return underlyingAilment;
    }

    public void setUnderlyingAilment(String underlying_Ailment) {
        this.underlyingAilment = underlyingAilment;
    }
    public User() {
    }

    public User(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public User(String firstName, String lastName, long phoneNumber, String address, String email, Gender gender, LocalDate dateOfbirth, int age, String stateOfOrigin, String localGovernmentOforigin, String nextOfKin, long nextOfkinphone, BloodGroup bloodGroup, Genotype genotype, String underlyingAilment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.dateOfbirth = dateOfbirth;
        this.age = age;
        this.stateOfOrigin = stateOfOrigin;
        this.localGovernmentOforigin = localGovernmentOforigin;
        NextOfKin = nextOfKin;
        this.nextOfkinphone = nextOfkinphone;
        BloodGroup = bloodGroup;
        this.genotype = genotype;
        this.underlyingAilment = underlyingAilment;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                ", phone_Number=" + phoneNumber +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", dateOfbirth=" + dateOfbirth +
                ", age=" + age +
                ", state_Of_Origin='" + stateOfOrigin + '\'' +
                ", local_Government_Of_origin='" + localGovernmentOforigin + '\'' +
                ", Next_Of_Kin='" + NextOfKin + '\'' +
                ", next_Of_kin_phone='" + nextOfkinphone + '\'' +
                ", BloodGroup=" + BloodGroup +
                ", genotype=" + genotype +
                ", underlying_Ailment='" + underlyingAilment + '\'' +
                '}';
    }

    private  int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return phoneNumber == user.phoneNumber && age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName)&& Objects.equals(address, user.address) && Objects.equals(email, user.email) && gender == user.gender && Objects.equals(dateOfbirth, user.dateOfbirth) && Objects.equals(stateOfOrigin, user.stateOfOrigin) && Objects.equals(localGovernmentOforigin, user.localGovernmentOforigin) && Objects.equals(NextOfKin, user.NextOfKin) && Objects.equals(nextOfkinphone, user.nextOfkinphone) && BloodGroup == user.BloodGroup && genotype == user.genotype && Objects.equals(underlyingAilment, user.underlyingAilment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumber, address, email, gender, dateOfbirth, age, stateOfOrigin, localGovernmentOforigin, NextOfKin, nextOfkinphone, BloodGroup, genotype, underlyingAilment);
    }

}
