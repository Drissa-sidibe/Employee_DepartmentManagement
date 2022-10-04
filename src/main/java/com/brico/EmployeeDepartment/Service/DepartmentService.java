package com.brico.EmployeeDepartment.Service;



import com.brico.EmployeeDepartment.Entity.Department;
import com.brico.EmployeeDepartment.Excepttion.EmployeeDepartmentNodFound;

import java.util.List;

public interface DepartmentService {

    Department addDepartment(Department department);
    List<Department> getAllDepartment();
    Department findDepartment(Long id) throws EmployeeDepartmentNodFound;
    Department editDepartment(Long id, Department department);
    void deleteDepartment(Long id) throws EmployeeDepartmentNodFound;

}
