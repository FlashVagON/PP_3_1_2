package flashvagon.kata.pp312.dao;

import flashvagon.kata.pp312.model.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);
    void updateUser(User user);
    User showUser(int id);
    void deleteUser(int id);
    List<User> listUsers();
}
