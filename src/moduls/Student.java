package moduls;

public class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "moduls.Student: " + super.toString() + " earns " + this.getPaymentAmount();
    }

    @Override
    public final double getPaymentAmount() {
        if (this.gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.0;
        }
    }
}