package edu.mum.cs.cs425.demos.eregistrar.service.impl;

import edu.mum.cs.cs425.demos.eregistrar.model.Student;
import edu.mum.cs.cs425.demos.eregistrar.repository.StudentRepository;
import edu.mum.cs.cs425.demos.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Iterable<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentById(Integer bookId) {
        return repository.findById(bookId).orElse(null);
    }

    @Override
    public void deleteStudentById(Integer bookId) {
        repository.deleteById(bookId);
    }

    @Override
    public List<Student>  findByFirstNameContainingIgnoreCase(String name){
        List<Student> founList = repository.findByFirstNameContainingIgnoreCase(name);
        System.out.println("fond list -------------");
        System.out.println(founList);
        return repository.findByFirstNameContainingIgnoreCase(name);
    }

}
