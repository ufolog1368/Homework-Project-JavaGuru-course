package by.HW1JavaGuru.Service;

import by.HW1JavaGuru.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PersonService {
    private Person person;
    private Logger logger = LoggerFactory.getLogger(PersonService.class);

    public PersonService(Person person) {
        this.person = person;
    }
    public boolean ifAult(){
        logger.info("Checking if person is Adult");
        return person.getAge()>= 18;
    }
}
