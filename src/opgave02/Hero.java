package opgave02;

public class Hero {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String name;
    private String pronoun;
    private String weapon;

    public Hero(int lifePoints, int damagePoints, int chanceOfHit, String name, String pronoun, String weapon) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.name = name;
        this.pronoun = pronoun;
        this.weapon = weapon;
    }

    public void attacks(int roll, Monster monster) {
        System.out.print(name + " attacks with " + pronoun + " " + weapon);
        if (roll <= chanceOfHit) {
            System.out.println(" and hits the " + monster.getDescription() + " inflicting " + damagePoints + " damage");
            monster.setLifePoints(monster.getLifePoints() - getDamagePoints());
            System.out.println("Darlek now have: " + monster.getLifePoints() + " health left" + "\n");
            if (monster.getLifePoints() <= 0) {
                System.out.println("killing the " + monster.getDescription());
            }
        } else {
            System.out.println(" but misses the target." + "\n");
        }
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public int getChanceOfHit() {
        return chanceOfHit;
    }

    public void setChanceOfHit(int chanceOfHit) {
        this.chanceOfHit = chanceOfHit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
