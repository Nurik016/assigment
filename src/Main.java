import moduls.Employee;
import moduls.Person;
import moduls.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Singer", 27045.78));
        people.add(new Student("Paul", "McCartney", 3.7));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Employee("George", "Harrison", "Guitarist", 50000.00));

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}