package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String role;

    public Roles() {
    }

    public Roles(String role) {
        this.role = role;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 45)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return id == roles.id &&
                Objects.equals(role, roles.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role);
    }
}
