package Student.Management.System.example.Student.Management.System.Service;

import java.util.List;

import Student.Management.System.example.Student.Management.System.Entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
