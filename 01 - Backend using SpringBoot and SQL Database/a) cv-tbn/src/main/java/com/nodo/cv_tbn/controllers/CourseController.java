package com.nodo.cv_tbn.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nodo.cv_tbn.repositories.CourseRepository;
import com.nodo.cv_tbn.models.Course;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses") //Read
    public List<Course> listCourses(){
        return courseRepository.findAll();
    }

    @PostMapping("/courses") //Create
    public String createCourses(@RequestBody Course course){
        courseRepository.save(course);
        return String.format("Your course %s was succesfully added!",course.getName());
    }

    @PutMapping("/courses") //Update
    public String modifyCourses(@RequestBody Course course){
        Optional<Course> courseToModify = courseRepository.findById(course.getId());

        if (courseToModify != null){
            courseRepository.save(course);
        }
        return String.format("Your Course %s was succesfully modified", course.getName());
    }

    @DeleteMapping("/courses") //Delete
    public String deleteCourses(@RequestParam(value= "id") Long id) {
        courseRepository.deleteById(id);
        return String.format("Your course with id %s was deleted", id);
    }   
}
