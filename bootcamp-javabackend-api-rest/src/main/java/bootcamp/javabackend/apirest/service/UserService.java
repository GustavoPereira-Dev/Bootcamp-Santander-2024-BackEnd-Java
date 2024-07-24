package bootcamp.javabackend.apirest.service;

import bootcamp.javabackend.apirest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}