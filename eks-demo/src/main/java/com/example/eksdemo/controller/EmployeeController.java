package com.example.eksdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eksdemo.model.Employee;
import com.example.eksdemo.repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.websocket.server.PathParam;

@RestController(value = "/")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping
	public void createEmployee(@RequestBody com.example.eksdemo.dto.Employee employee) {
		Employee emp = new Employee();
		emp.setEmployeeName(employee.getName());
		emp.setSalary(employee.getSalary());
		employeeRepository.save(emp);
	}

	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("employeeId") String employeeId) {
		Optional<Employee> employee = employeeRepository.findById(Integer.parseInt(employeeId));
		if (employee.isPresent()) {
			return new ResponseEntity<Employee>(employee.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Employee>(employee.get(), HttpStatus.BAD_REQUEST);
	}

}
