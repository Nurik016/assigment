package moduls;
import interfaces.Payable;
public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = ++idCounter;
    }

    public Person(String name, String surname) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "moduls.Student";
    }

    @Override
    public String toString() {
        return "1. " + this.name + " " + this.surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}