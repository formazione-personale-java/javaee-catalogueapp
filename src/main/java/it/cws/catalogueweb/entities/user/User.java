package it.cws.catalogueweb.entities.user;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String picture;
    private boolean enable;
    private String remenberToken;
    private LocalDate created_at;
    private LocalDate update_at;
    private LocalDate delete_at;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getRemenberToken() {
        return remenberToken;
    }

    public void setRemenberToken(String remenberToken) {
        this.remenberToken = remenberToken;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDate update_at) {
        this.update_at = update_at;
    }

    public LocalDate getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(LocalDate delete_at) {
        this.delete_at = delete_at;
    }
}
