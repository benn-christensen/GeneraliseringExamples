public class Main {
    public static void main(String[] args) {
        //Person person = new Person("Henrik ", "SH30", "Kandidant");
        //Student student = new Student("Benn ", "SH30", "Bachelor", 6.4);
        //student.print();
        Weapon[] weapons = new Weapon[2];
        weapons[0] = new LongSword(120, 70);
        weapons[1] = new Dagger(2000, 40);

        for (int index = 0; index < weapons.length; index++) {
            System.out.println("Skade: " + weapons[index].calcDamage(250));
        }
    }
}