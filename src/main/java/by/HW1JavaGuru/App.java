package by.HW1JavaGuru;

import by.HW1JavaGuru.Service.PersonService;
import by.HW1JavaGuru.bean.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(17);
        person.setMame("Igor");

        PersonService personService = new PersonService(person);
        System.out.println("personService.ifAult() = " + personService.ifAult());

    }
}
