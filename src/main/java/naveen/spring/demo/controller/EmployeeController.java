package naveen.spring.demo.controller;

import naveen.spring.demo.entity.Employee;
import naveen.spring.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/findAll")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/find")
    public Employee findById(@RequestParam long id) {
        return employeeService.findById(id);
    }


    @GetMapping("/find/{id}")
    public Employee findByIdPathVariable(@PathVariable  long id) {
        return employeeService.findById(id);
    }
}
