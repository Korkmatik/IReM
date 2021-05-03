package korkmatik.irem.backend.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToOne
    private Address address;

    @OneToMany
    private List<ContactPerson> contactPersons;
}
