package pl.lukakan.housingassociation.model;

import pl.lukakan.housingassociation.buildling.Building;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flats")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private Double surface;
    @ManyToOne()
    private Building building;
    @OneToMany(mappedBy = "flat", cascade = CascadeType.REMOVE)
    private List<Meter> meters;


}
