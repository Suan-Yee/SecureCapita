package io.getarrays.securecapita.repository;

import io.getarrays.securecapita.domain.User;
import io.getarrays.securecapita.dto.UserDTO;

import java.util.Collection;

/**
 * @author Junior RT
 * @version 1.0
 * @license Get Arrays, LLC (https://getarrays.io)
 * @since 8/22/2022
 */
public interface UserRepository<T extends User> {
    /* Basic CRUD Operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More Complex Operations */
    User getUserByEmail(String email);
    void sendVerificationCode(UserDTO user);
}