package io.z.pensive.authsecuirty.service;
import io.z.pensive.authsecuirty.entity.*;
import java.util.List;

public interface UserService {
    User save(User user);

    User findById(Long id);

    User findByUsername(String username);

    List<User> findAll();

    void delete(Long id);

}
