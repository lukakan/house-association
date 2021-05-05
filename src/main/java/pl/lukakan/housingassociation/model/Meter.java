package pl.lukakan.housingassociation.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "meters")
public class Meter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    @OneToMany(mappedBy = "meter", cascade = CascadeType.REMOVE)
    private List<Record> records;
    @ManyToOne()
    private Flat flat;

}
