public class Dagger extends Weapon {
    public Dagger(int range, int baseDamage) {
        super(range, baseDamage);
    }

    @Override
    public double calcDamage(int distance) {
        if (getRange() < distance) {
            return getBaseDamage() / 3;
        } else {
            return getBaseDamage();
        }
    }
}
