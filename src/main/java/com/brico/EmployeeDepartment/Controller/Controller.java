package com.brico.EmployeeDepartment.Controller;

import com.brico.EmployeeDepartment.Entity.Department;
import com.brico.EmployeeDepartment.Excepttion.EmployeeDepartmentNodFound;
import com.brico.EmployeeDepartment.Service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class Controller {

    private final DepartmentServiceImpl departmentService;

    @Autowired
    public Controller(DepartmentServiceImpl departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments(){
        return new ResponseEntity<>(departmentService.getAllDepartment(), HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable("id") Long id) throws EmployeeDepartmentNodFound {
        return new ResponseEntity<>(departmentService.findDepartment(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Department> editDepartment( @PathVariable("id") Long id, @RequestBody Department department){
        return new ResponseEntity<>(departmentService.editDepartment(id, department),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable("id") Long id) throws EmployeeDepartmentNodFound {
        departmentService.deleteDepartment(id);
        return null;
    }

}
