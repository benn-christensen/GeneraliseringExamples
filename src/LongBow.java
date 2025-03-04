public class LongBow extends Weapon {
    public LongBow(int range, int baseDamage) {
        super(range, baseDamage);
    }

    @Override
    public double calcDamage(int distance) {
        return getBaseDamage() * getRange() / distance;
    }
}
