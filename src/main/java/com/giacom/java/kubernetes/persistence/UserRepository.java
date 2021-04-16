package com.carlos.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.carlos.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

