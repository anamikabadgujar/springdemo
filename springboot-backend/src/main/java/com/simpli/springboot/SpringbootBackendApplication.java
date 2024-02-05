package com.simpli.springboot;

import com.simpli.springboot.model.Employee;
import com.simpli.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}


	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Aman");
		employee.setLastName("Badgujar");
		employee.setEmailId("aman@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Tushar");
		employee1.setLastName("Badgujar");
		employee1.setEmailId("tushar@gmail.com");
		employeeRepository.save(employee1);






	}
}
