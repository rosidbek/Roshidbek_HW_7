public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[] {
                new Magic(140, 40),
                new Medic(150, 35, 60),
                new Warrior(170, 20)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("Новое значение healPoints медика: " + ((Medic) hero).getHealPoints());
            }
        }
    }
}