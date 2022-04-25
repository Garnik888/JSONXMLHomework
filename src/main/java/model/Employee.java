package model;

import jakarta.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "employeeXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private int age;
    @XmlElement
    private Address address;
    @XmlElement
    private List<PhoneNumber> pnl;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int age, Address address, List<PhoneNumber> pnl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.pnl = pnl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPnl() {
        return pnl;
    }

    public void setPnl(List<PhoneNumber> pnl) {
        this.pnl = pnl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(address, employee.address) && Objects.equals(pnl, employee.pnl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, address, pnl);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", pnl=" + pnl +
                '}';
    }
}
