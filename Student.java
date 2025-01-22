package library;
public class Student extends Person {
    private int year;
    private boolean isSenior;

    public Student(String name, int year, boolean isSenior) {
        super(name);
        this.year = year;
        this.isSenior = isSenior;
    }

    public int getYear() {
        return year;
    }

    public boolean isSenior() {
        return isSenior;
    }
}