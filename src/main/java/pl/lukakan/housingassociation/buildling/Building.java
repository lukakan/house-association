package pl.lukakan.housingassociation.buildling;

import org.hibernate.annotations.Cascade;
import pl.lukakan.housingassociation.administration.Administration;
import pl.lukakan.housingassociation.model.Flat;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String street;
    @OneToMany(mappedBy = "building", cascade = CascadeType.REMOVE)
    private List<Flat> flats;
    @ManyToOne
    private Administration administration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    public Administration getAdministration() {
        return administration;
    }

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }
}
