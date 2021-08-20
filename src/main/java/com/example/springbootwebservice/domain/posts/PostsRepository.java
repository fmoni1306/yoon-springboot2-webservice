package com.example.springbootwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    // Query 가 가독성이 좋아 선택해서 사용.
    // Query 없이 SpringDataJpa 에서 제공하는 기본 메소드만으로도 해결 가능
    @Query("SELECT p from Posts p ORDER BY p.id DESC ")
    List<Posts> findAllDesc();
}
