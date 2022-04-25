package jsonxmlutils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import model.Address;
import model.Employee;
import model.PhoneNumber;


import java.io.*;
import java.util.*;

public class EmployeeXmlConverter {

    public static void main(String[] args) {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            Address address = new Address("Yerevan", "Armenia", "Moldovakan 44/3", "0062");
            PhoneNumber phoneNumber = new PhoneNumber("Mobile", "+37477514417");
            List<PhoneNumber> phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
                    Employee employee = new Employee("Garnik", "Vardanyan", 36,
                            address, phoneNumberList);
            marshaller.marshal(employee, new File("employee.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

         /*
        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Employee employee = (Employee) unmarshaller.unmarshal(new File("employee.xml"));
            System.out.println(employee.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }*/

    }
}
