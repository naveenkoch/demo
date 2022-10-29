package naveen.spring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_address")
public class Address {

    @Id
    @Column(name="id")
    private long id;

    @Column(name = "address")
    private String address;


}
