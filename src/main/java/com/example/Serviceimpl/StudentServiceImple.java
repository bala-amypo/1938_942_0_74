package com.example.demo.Serviceimpl;


import org.springframework.stereotype.Service;


import com.example.demo.service.StudentService;



@Service
public class StudentServiceImple implements StudentService{
    private final StudentRepository studentRepository;
    public StudentServiceImple(Student Repository studentRepository){
        this.studentRepository=studentRepository;
    }


    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

}
