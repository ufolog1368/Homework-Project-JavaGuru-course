package by.HW1JavaGuru.Service;

import by.HW1JavaGuru.bean.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceTest {

    @Test
    public void ifAultShouldReturnTrue() {
        Person person = new Person();
        person.setAge(18);


        PersonService personService = new PersonService(person);
        boolean expexted = true;
        boolean actual = personService.ifAult();
        assertEquals(expexted, actual);
    }

    @Test
    public void ifAultShouldReturnFalse() {
        Person person = new Person();
        person.setAge(17);


        PersonService personService = new PersonService(person);
        boolean expexted = false;
        boolean actual = personService.ifAult();
        assertEquals(expexted, actual);
    }

}