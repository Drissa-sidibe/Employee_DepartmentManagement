package com.brico.EmployeeDepartment.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    private String departmentName;
    private String departmentLocation;

//    public Department() {
//    }
//
//    public Department(Long departmentId, String departmentName, String departmentLocation) {
//        this.departmentId = departmentId;
//        this.departmentName = departmentName;
//        this.departmentLocation = departmentLocation;
//    }
//
//    public Long getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(Long departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentLocation() {
//        return departmentLocation;
//    }
//
//    public void setDepartmentLocation(String departmentLocation) {
//        this.departmentLocation = departmentLocation;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "departmentId=" + departmentId +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentLocation='" + departmentLocation + '\'' +
//                '}';
//    }
}
