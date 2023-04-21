package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
