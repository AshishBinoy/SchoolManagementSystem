package studentdbms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar
{
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, unique = true)
    private String number;

    @OneToOne(mappedBy = "aadhar")
    private Student student;

    public Aadhar() {}

    public Aadhar(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Aadhar [id=" + id + ", number=" + number + "]";
    }

}