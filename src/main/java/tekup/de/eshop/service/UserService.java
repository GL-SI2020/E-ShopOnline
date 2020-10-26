package tekup.de.eshop.service;



import java.util.Collection;

import org.springframework.stereotype.Service;

import tekup.de.eshop.model.User;


public interface UserService {
    User findOne(String email);
    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
