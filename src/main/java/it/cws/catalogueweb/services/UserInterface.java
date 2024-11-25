package it.cws.catalogueweb.services;

import it.cws.catalogueweb.entities.user.User;

import java.util.List;

public interface UserInterface {
    void createUser(User user);
    List<User> listUsers();
    User getUser(int id);
    User updateUser(int id);
    void deleteUser(int id);

}
