package Student.Management.System.example.Student.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Student.Management.System.example.Student.Management.System.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long >{

}
