package com.brico.EmployeeDepartment.Service;

import com.brico.EmployeeDepartment.Entity.Department;
import com.brico.EmployeeDepartment.Excepttion.EmployeeDepartmentNodFound;
import com.brico.EmployeeDepartment.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{


    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }


    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findDepartment(Long id) throws EmployeeDepartmentNodFound {
        return departmentRepository.findById(id).orElseThrow(()->
                new EmployeeDepartmentNodFound("This"+ id + "does not exist"));
    }

    @Override
    public Department editDepartment(Long id, Department department) {
        Department deparDb = departmentRepository.findById(id).get();
        if(Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())){
            deparDb.setDepartmentName(department.getDepartmentName());
            if(Objects.nonNull(department.getDepartmentLocation()) &&
            !"".equalsIgnoreCase(department.getDepartmentLocation())){
                deparDb.setDepartmentLocation(department.getDepartmentLocation());
            }
        }

        return departmentRepository.save(deparDb);
    }

    @Override
    public void deleteDepartment(Long id) throws EmployeeDepartmentNodFound{
         departmentRepository.findById(id).orElseThrow(()->
                 new EmployeeDepartmentNodFound("This" +id + "does not exist"));
         departmentRepository.deleteById(id);
    }
}
