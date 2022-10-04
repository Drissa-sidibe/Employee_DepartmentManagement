package com.brico.EmployeeDepartment.Excepttion;

import com.brico.EmployeeDepartment.Entity.Error;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
   @ExceptionHandler(EmployeeDepartmentNodFound.class)
    private ResponseEntity<Error> employeeNotFoundExpception(
           @NotNull EmployeeDepartmentNodFound departmentNodFound, WebRequest departmentRequest){

        Error errorMessage = new Error(HttpStatus.NOT_FOUND, departmentNodFound.getMessage());
return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
