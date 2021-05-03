package korkmatik.irem.backend.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

public class CustomerDTO extends RepresentationModel<CustomerDTO> {

    private final String name;
    private Integer addressId;
    private List<Integer> contactPersonsId;

    @JsonCreator
    public CustomerDTO(@JsonProperty("name") String name,
                       @JsonProperty("addressId") Integer addressId,
                       @JsonProperty("contactPersons") List<Integer> contactPersonsId) {
        this.name = name;
        this.addressId = addressId;
        this.contactPersonsId = contactPersonsId;
    }

    public String getName() {
        return name;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public List<Integer> getContactPersonsId() {
        return contactPersonsId;
    }
}
