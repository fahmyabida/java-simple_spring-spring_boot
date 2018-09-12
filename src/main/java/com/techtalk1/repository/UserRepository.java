package com.techtalk1.repository;

import com.techtalk1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Fahmy Abida
 * Email : fahmyabida@gmail.com
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
