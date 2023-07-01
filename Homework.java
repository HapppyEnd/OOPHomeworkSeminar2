public class Homework {
    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(49);

        Hero hero = new Hero(200, 175);
        hero.setCurrentHealthPoint(20);
        hero.setCurrentManaPoint(65);

        Neutral neutral = new Neutral(50);
        neutral.setCurrentHealthPoint(35);

        render.showIndicator(building);
        render.showIndicator(hero);
        render.showIndicator(neutral);
    }
}