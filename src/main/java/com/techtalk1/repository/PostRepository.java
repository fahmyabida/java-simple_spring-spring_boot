package com.techtalk1.repository;

import com.techtalk1.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Fahmy Abida
 * Email : fahmyabida@gmail.com
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
    Optional<Post> findByIdUser(Integer integer);
}
