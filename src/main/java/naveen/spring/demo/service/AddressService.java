package naveen.spring.demo.service;

import naveen.spring.demo.entity.Address;
import naveen.spring.demo.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    public Address save(Address address) {
        return addressRepo.save(address);
    }

    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    public Address findById(long id) {
        return addressRepo.findById(id).orElse(null);
    }
}
