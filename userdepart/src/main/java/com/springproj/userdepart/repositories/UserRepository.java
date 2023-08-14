package com.springproj.userdepart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproj.userdepart.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
