package com.example.friendsappv0;

public class Friends {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    // constructor
    public Friends (int newId, String newFirstName, String newLastName, String newEmail) {
        // Reference Setters
        setID(newId);
        setFirstName(newFirstName);
        setLastName(newLastName);
        setEmail(newEmail);

    }

    // SETTERS
    private void setEmail(String newEmail) {
        email = newEmail;
    }

    private void setLastName(String newLastName) {
        lastName = newLastName;
    }

    private void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    private void setID(int newId) {
        id = newId;
    }



    // GETTERS
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // Create a toString method
    public String toString() {
        return id + "; " + firstName + "; " + lastName + "; " + email;
    }




}
