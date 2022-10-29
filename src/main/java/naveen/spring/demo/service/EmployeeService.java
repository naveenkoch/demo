package naveen.spring.demo.service;

import naveen.spring.demo.entity.Address;
import naveen.spring.demo.entity.Employee;
import naveen.spring.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee findById(long id) {
        return employeeRepo.findById(id).orElse(null);
    }
}
