package main.java.org.gunendu.generics;

import main.java.org.gunendu.generics.pojo.BoundedPersonContainer;
import main.java.org.gunendu.generics.pojo.Faculty;
import main.java.org.gunendu.generics.pojo.Person;
import main.java.org.gunendu.generics.pojo.PersonContainer;
import main.java.org.gunendu.generics.pojo.PersonManager;
import main.java.org.gunendu.generics.pojo.Student;
import main.java.org.gunendu.generics.pojo.StudentsPair;
import main.java.org.gunendu.generics.pojo.Util;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        Person person = new Person();
        person.setFirstName("Gunendu");
        person.setLastName("Das");

        Student student = new Student();
        student.setUniversity("MNNIT");
        student.setFirstName("Rajesh");
        student.setLastName("Mallick");

        Student student1 = new Student();
        student1.setUniversity("NIT Warangal");
        student1.setFirstName("Kamlesh");
        student1.setLastName("Mallick");

        Faculty faculty = new Faculty();
        faculty.setUniversity("MNNIT");

        PersonManager personManager = new PersonManager();
        personManager.printList(Arrays.asList(student, new Student()));

        PersonContainer<Student> personContainer = new PersonContainer<>();
        personContainer.setObj(student);
        System.out.println("Person Container is " + personContainer.getObj().getUniversity());

        BoundedPersonContainer<Student> boundedPersonContainer = new BoundedPersonContainer<>();
        boundedPersonContainer.setObj(student);
        System.out.println("Person Container is " + boundedPersonContainer.getObj().getUniversity());

        System.out.println(boundedPersonContainer.concatStr(student, student1));

        StudentsPair<String, String> studentsPair =
                new StudentsPair<>(student.getFirstName(), student.getLastName());

        StudentsPair<String , String > studentsPair1 =
                new StudentsPair<>(student1.getFirstName(), student1.getLastName());

        boolean match = Util.compareTo(studentsPair, studentsPair1);
        System.out.println("Students pair does not match " + match);
    }
}

