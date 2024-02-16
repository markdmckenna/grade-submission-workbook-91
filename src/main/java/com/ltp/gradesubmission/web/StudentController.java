package com.ltp.gradesubmission.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.gradesubmission.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/student")
public class StudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    // private StudentService studentService;

    // public StudentController(StudentService studentService) {
    //     this.studentService = studentService;
    // }

    
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        LOGGER.info("[IN]StudentController - getStudent - id: {}", id);
        // Student student = studentService.getStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        LOGGER.info("[IN]StudentController - saveStudent - student: {}", student);
        
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id) {
        LOGGER.info("[IN]StudentController - deleteStudent - id: {}", id);
        
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getStudents() {
        LOGGER.info("[IN]StudentController - getStudents");
        // Student student = studentService.getStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

}
