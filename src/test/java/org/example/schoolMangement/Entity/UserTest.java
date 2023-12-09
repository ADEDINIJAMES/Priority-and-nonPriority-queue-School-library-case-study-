package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.BloodGroup;
import org.example.schoolMangement.enums.Gender;
import org.example.schoolMangement.enums.Genotype;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getName(){
        User user = new Students();
        user.setFirstName("James");
        assertEquals("James", user.getFirstName());
    }

    @Test
    void setName() {
        User user = new Students();
        user.setFirstName("Peter");
        assertEquals("Peter", user.getFirstName());
    }

    @Test
    void getPhoneNumber() {
        User user = new Students();
        user.setPhoneNumber(903423768L);
        assertEquals(903423768L, user.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        User user = new Students();
        user.setPhoneNumber(703423768L);
        assertEquals(703423768L, user.getPhoneNumber());
    }

    @Test
    void getAddress() {
        User user = new Students();
        user.setAddress("Lekki");
        assertEquals("Lekki", user.getAddress());
    }

    @Test
    void setAddress() {
        User user = new Students();
        user.setAddress("Ondo");
        assertEquals("Ondo", user.getAddress());
    }

    @Test
    void getEmail() {
        User user = new Students();
        user.setEmail("adedini@gmail.com");
        assertEquals("adedini@gmail.com", user.getEmail());
    }

    @Test
    void setEmail() {
        User user = new Students();
        user.setEmail("james@gmail.com");
        assertEquals("james@gmail.com", user.getEmail());
    }

    @Test
    void getGender() {
        User user = new Students();
        user.setGender(Gender.MALE);
        assertEquals(Gender.MALE, user.getGender());


    }

    @Test
    void setGender() {
        User user = new Students();
        user.setGender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, user.getGender());

    }

    @Test
    void getDateOfbirth() {
    User user= new Students();
    user.setDateOfbirth(LocalDate.parse("2023-02-19"));
    assertEquals(("2023-02-19" ),user.getDateOfbirth().toString());
    }

    @Test
    void setDateOfbirth() {
        User user= new Students();
        user.setDateOfbirth(LocalDate.parse("2023-03-19"));
        assertEquals(("2023-03-19" ),user.getDateOfbirth().toString());
    }

    @Test
    void getAge() {
        User user= new Students();
        user.setAge(15);
        assertEquals(15, user.getAge());

    }


  @Test
    void setAge() {
      User user= new Students();
      user.setAge(25);
      assertEquals(25, user.getAge());

    }
    @Test
    void setStateOfOriginTest() {
        User user= new Students();
        user.setStateOfOrigin("Ondo");
        assertEquals("Ondo", user.getStateOfOrigin());

    }
    @Test
    void getStateOfOrigin() {
        User user = new Students();
        user.setStateOfOrigin("Oyo");
        assertEquals("Oyo", user.getStateOfOrigin());
    }
    @Test
    void getNextOfKinTest() {
        User user = new Students();
        user.setNextOfKin("Ojo");
        assertEquals("Ojo", user.getNextOfKin());
    }
    @Test
    void setNextOfKinTest() {
        User user = new Students();
        user.setNextOfKin("Sade");
        assertEquals("Sade", user.getNextOfKin());
    }
    @Test
    void getLocalGovernmentTest() {
        User user = new Students();
        user.setLocalGovernmentOforigin("Eleyele");
        assertEquals("Eleyele", user.getLocalGovernmentOforigin());
    }
    @Test
    void setLocalGovernmentOforigin() {
        User user = new Students();
        user.setLocalGovernmentOforigin("Abeokuta South");
        assertEquals("Abeokuta South", user.getLocalGovernmentOforigin());
    }
    @Test
    void getNextOfKinPhoneTest() {
        User user = new Students();
        user.setNextOfkinphone(908876666L);
        assertEquals(908876666L, user.getNextOfkinphone());
    }
    @Test
    void setNextOfKinPhoneTest() {
        User user = new Students();
        user.setNextOfkinphone(908876666L);
        assertEquals(9088763333L, user.getNextOfkinphone());
    }
    @Test
    void setBloodGroupTest() {
        User user = new Students();
        user.setBloodGroup(BloodGroup.AA);
        assertEquals(BloodGroup.AA, user.getBloodGroup());
    }
    @Test
    void getBloodGroupTest() {
        User user = new Students();
        user.setBloodGroup(BloodGroup.AB);
        assertEquals(BloodGroup.AB, user.getBloodGroup());
    }
    @Test
    void getGenotype() {
        User user = new Students();
        user.setGenotype(Genotype.A_POS);
        assertEquals(Genotype.A_POS, user.getGenotype());
    }
    @Test
    void setGenotype() {
        User user = new Students();
        user.setGenotype(Genotype.A_NEG);
        assertEquals(Genotype.A_NEG, user.getGenotype());
    }
    @Test
    void setUnderlyingAilment() {
        User user = new Students();
        user.setUnderlyingAilment("Fever");
        assertEquals("Fever", user.getUnderlyingAilment());
    }
    @Test
    void getUnderlyingAilment() {
        User user = new Students();
        user.setUnderlyingAilment("Tuberculosis");
        assertEquals("Tuberculosis", user.getUnderlyingAilment());
    }
}