package naveen.spring.demo.controller;

import naveen.spring.demo.entity.Address;
import naveen.spring.demo.repo.AddressRepo;
import naveen.spring.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address/api")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private AddressRepo addressRepo;

    public Address save(Address address) {
        return addressService.save(address);
    }

    public List<Address> findAll() {
        return addressService.findAll();
    }

    public Address findById(long id) {
        return addressService.findById(id);
    }
}
