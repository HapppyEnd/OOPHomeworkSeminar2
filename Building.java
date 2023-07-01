public class Building implements Health {

    private int maxHealthPoint;
    private int currentHealthPoint;

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public void printHealth() {
        System.out.println(
                String.format("Current health: %d", this.currentHealthPoint));
        System.out.println(
                String.format("Max health: %d", this.maxHealthPoint));
    }

    @Override
    public void setHealth(int health) {
        this.currentHealthPoint = health;
    }

    @Override
    public int getCurrentHealthPoint() {
        return this.currentHealthPoint;
    }

    @Override
    public int getMaxHealthPoint() {
        return this.maxHealthPoint;
    }
}