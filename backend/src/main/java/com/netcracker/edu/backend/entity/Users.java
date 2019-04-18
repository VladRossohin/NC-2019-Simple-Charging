package com.netcracker.edu.backend.entity;

import com.netcracker.edu.backend.dto.UsersDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer roleId;
    private Roles rolesByRoleId;

    public UsersDTO convertToDto() {
        UsersDTO usersDTO = new UsersDTO();
        usersDTO.setLogin(this.login);
        usersDTO.setFirstName(this.firstName);
        usersDTO.setLastName(this.lastName);
        usersDTO.setEmail(this.email);
        usersDTO.setRole(this.rolesByRoleId.getRole());
        return usersDTO;
    }

    public Users() {
    }

    public Users(String login, String firstName, String lastName, String email, String password, Integer roleId, Roles rolesByRoleId) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roleId = roleId;
        this.rolesByRoleId = rolesByRoleId;
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "role_id", nullable = true, insertable = false, updatable = false)
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                Objects.equals(login, users.login) &&
                Objects.equals(firstName, users.firstName) &&
                Objects.equals(lastName, users.lastName) &&
                Objects.equals(email, users.email) &&
                Objects.equals(password, users.password) &&
                Objects.equals(roleId, users.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, firstName, lastName, email, password, roleId);
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    public Roles getRolesByRoleId() {
        return rolesByRoleId;
    }

    public void setRolesByRoleId(Roles rolesByRoleId) {
        this.rolesByRoleId = rolesByRoleId;
    }
}
