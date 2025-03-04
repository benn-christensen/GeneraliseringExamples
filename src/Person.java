public abstract class Person {
    private String firstName;
    private String lastName;
    private String adress;
    private String qualification;

    public Person(String name, String adress, String qualification) {
        this.firstName = name.substring(0, name.indexOf(' '));
        this.adress = adress;
        this.qualification = qualification;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void print() {
        System.out.print("Navn: " + firstName + " Adresse: " + adress);
    }

    public abstract void doSomething();
}
