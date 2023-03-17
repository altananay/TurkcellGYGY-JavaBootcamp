package org.turkcell;

public class IndividualUser extends User {
    private String firstName;
    private String lastName;
    private String nationalIdentity;

    public IndividualUser() {
    }

    public IndividualUser(int id, String email, String password, String firstName, String lastName, String nationalIdentity) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
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

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
}