package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//http://www.mastertheboss.com/hibernate-jpa/maven-hibernate-jpa/maven-and-hibernate-4-tutorial/

@Entity
@Table
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
    private List<Employee> employees = new ArrayList<Employee>();

    public Department() {
        super();
    }
    public Department(String name) {
        this.name = name;
    }
}


