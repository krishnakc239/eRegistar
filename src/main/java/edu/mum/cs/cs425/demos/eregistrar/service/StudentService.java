package edu.mum.cs.cs425.demos.eregistrar.service;

import edu.mum.cs.cs425.demos.eregistrar.model.Student;

import java.util.List;

public interface StudentService {

    public abstract Iterable<Student> getAllStudents();
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Integer bookId);
    public abstract void deleteStudentById(Integer bookId);
    public List<Student> findByFirstNameContainingIgnoreCase(String name);


}
