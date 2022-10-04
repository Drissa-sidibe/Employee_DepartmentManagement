package com.brico.EmployeeDepartment.Excepttion;

public class EmployeeDepartmentNodFound extends Exception{
    public EmployeeDepartmentNodFound() {
    }
    public EmployeeDepartmentNodFound(String message) {
        super(message);
    }
    public EmployeeDepartmentNodFound(String message, Throwable cause) {
        super(message, cause);
    }
    public EmployeeDepartmentNodFound(Throwable cause) {
        super(cause);
    }
    public EmployeeDepartmentNodFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
