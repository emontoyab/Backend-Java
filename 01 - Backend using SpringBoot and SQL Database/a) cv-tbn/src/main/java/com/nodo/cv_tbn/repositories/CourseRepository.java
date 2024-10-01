package com.nodo.cv_tbn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nodo.cv_tbn.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
