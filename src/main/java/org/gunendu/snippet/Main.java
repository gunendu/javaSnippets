package main.java.org.gunendu.snippet;

import main.java.org.gunendu.snippet.pojo.BoundedPersonContainer;
import main.java.org.gunendu.snippet.pojo.Faculty;
import main.java.org.gunendu.snippet.pojo.Person;
import main.java.org.gunendu.snippet.pojo.PersonContainer;
import main.java.org.gunendu.snippet.pojo.PersonManager;
import main.java.org.gunendu.snippet.pojo.Student;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        Person person = new Person();
        person.setFirstName("Gunendu");
        person.setLastName("Das");

        Student student = new Student();
        student.setUniversity("MNNIT");
        student.setFirstName("Rajesh");

        Student student1 = new Student();
        student1.setUniversity("NIT Warangal");

        Faculty faculty = new Faculty();
        faculty.setUniversity("MNNIT");
        faculty.setFirstName("Kamlesh");

        PersonManager personManager = new PersonManager();
        personManager.printList(Arrays.asList(student, new Student()));

        PersonContainer<Student> personContainer = new PersonContainer<>();
        personContainer.setObj(student);
        System.out.println("Person Container is " + personContainer.getObj().getUniversity());

        BoundedPersonContainer<Student> boundedPersonContainer = new BoundedPersonContainer<>();
        boundedPersonContainer.setObj(student);
        System.out.println("Person Container is " + boundedPersonContainer.getObj().getUniversity());

        System.out.println(boundedPersonContainer.concatStr(student, student1));
    }
}

