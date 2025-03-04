public abstract class Weapon {
    private int range;
    private int baseDamage;

    public Weapon(int range, int baseDamage) {
        this.range = range;
        this.baseDamage = baseDamage;
    }

    public int getRange() {
        return range;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public abstract double calcDamage(int distance);
}
