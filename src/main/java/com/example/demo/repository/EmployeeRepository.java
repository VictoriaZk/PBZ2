package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM employee WHERE employee.age = :ages AND employee.position_id = :position")
    List<Employee> findAllByAgeAndPosition(@Param("age") Integer age, @Param("position") Integer position);

}
