package com.netcracker.edu.backend.dto;

import com.netcracker.edu.backend.entity.Users;

public class UsersDTO {
    String login;
    String firstName;
    String lastName;
    String email;
    String role;

    private Users convertToEntity() {
        Users users = new Users();
        users.setLogin(this.login);
        users.setFirstName(this.firstName);
        users.setLastName(this.lastName);
        users.setEmail(this.email);
        return users;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
