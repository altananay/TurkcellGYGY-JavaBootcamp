package org.turkcell;

public class Employee extends IndividualUser{
    private String socialSecurityNumber;

    public Employee() {
    }

    public Employee(int id, String email, String password, String firstName, String lastName, String nationalIdentity, String socialSecurityNumber) {
        super(id, email, password, firstName, lastName, nationalIdentity);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}