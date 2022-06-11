package main.java.org.gunendu.snippet.pojo;

import java.util.List;

public class PersonManager {

    public void printList(List<? extends Person> persons) {
        persons.forEach(person -> System.out.println("Name is " + person.getFirstName()));
    }
}
