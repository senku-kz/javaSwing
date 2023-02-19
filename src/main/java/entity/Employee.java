package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Department department;

    public Employee() {}

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department="
                + department.getName() + "]";
    }
}