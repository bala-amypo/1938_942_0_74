package com.example.demo.Serviceimpl;


import org.springframework.stereotype.Service;


import com.example.demo.service.StudentService;



@Service
public class StudentServiceImple implements StudentService{
    

    @Autowired
    StudentRepository studentRepository;
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

}