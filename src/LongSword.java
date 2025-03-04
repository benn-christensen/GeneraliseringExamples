public class LongSword extends Weapon{
    public LongSword(int range, int baseDamage) {
        super(range, baseDamage);
    }

    @Override
    public double calcDamage(int distance) {
        if (getRange() < distance) {
            return 0;
        } else {
            return getBaseDamage();
        }
    }
}
