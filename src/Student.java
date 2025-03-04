public class Student extends Person {
    private double gradeAverage;

    public Student(String name, String adress, String qualification, double gradeAverage) {
        super(name, adress, qualification);
        this.gradeAverage = gradeAverage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" grade avarage: " + gradeAverage );
    }

    @Override
    public void doSomething() {
        System.out.println("Hi");
    }
}
