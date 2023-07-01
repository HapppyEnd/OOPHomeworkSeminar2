public class Hero implements Health, Mana {

    private int maxHealthPoint;
    private int currentHealthPoint;

    private int maxManaPoint;
    private int currentManaPoint;

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public void printMana() {
        System.out.println(
                String.format("Current mana: %d", this.currentManaPoint));
        System.out.println(
                String.format("Max mana: %d", this.maxManaPoint));
    }

    @Override
    public void printHealth() {
        System.out.println(
                String.format("Current health: %d", this.currentHealthPoint));
        System.out.println(
                String.format("Max health: %d", this.maxHealthPoint));
    }

    @Override
    public void setMana(int mana) {
        this.currentManaPoint = mana;
    }

    @Override
    public void setHealth(int health) {
        this.currentHealthPoint = health;
    }

    @Override
    public int getMaxHealthPoint() {
        return this.maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return this.currentHealthPoint;
    }

    @Override
    public int getMaxManaPoint() {
        return this.maxManaPoint;
    }

    @Override
    public int getCurrentManaPoint() {
        return this.currentManaPoint;
    }
}
