package com.brico.EmployeeDepartment.Repository;

import com.brico.EmployeeDepartment.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
