package Entities;

import java.util.Date;

public class User {
    private int id;
    private long nationalId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String userName;

    public User(int id, long nationalId, String firstName, String lastName, Date birthDate, String userName) {
        this.id = id;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNationalId() {
        return nationalId;
    }

    public void setNationalId(long nationalId) {
        this.nationalId = nationalId;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
