package com.ltp.gradesubmission.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.gradesubmission.entity.Course;

@RestController
@RequestMapping("/course")
public class CourseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CourseController.class);

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable Long id) {
        LOGGER.info("[IN]CourseController - getCourse - id: {}", id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        LOGGER.info("[IN]CourseController - saveCourse - course: {}", course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long id) {
        LOGGER.info("[IN]CourseController - deleteCourse - id: {}", id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Course>> getCourses() {
        LOGGER.info("[IN]CourseController - getCourses");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}