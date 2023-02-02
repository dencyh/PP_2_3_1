package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getAll();

    User getOneById(long id);

    void deleteById(long id);

    void update( User user);
}
