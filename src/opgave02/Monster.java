package opgave02;

public class Monster {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String description;
    private String attackDescription;

    public Monster(int lifePoints, int damagePoints, int chanceOfHit, String description, String attackDescription) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.description = description;
        this.attackDescription = attackDescription;
    }
    public void attacks(int roll, Hero hero) {
        System.out.print("The " + description + " " + attackDescription);
        if (roll <= chanceOfHit) {
            System.out.println(" inflicting " + damagePoints + " damage");
            hero.setLifePoints(hero.getLifePoints()-getDamagePoints());
            System.out.println("Dr. Who now have: " + hero.getLifePoints() + " health left" + "\n");
            if (hero.getLifePoints() <= 0) {
                System.out.println("Slaying " + hero.getName());
            }
        } else {
            System.out.println(" but " + hero.getName() + " defends heroically" + "\n");
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttackDescription() {
        return attackDescription;
    }

    public void setAttackDescription(String attackDescription) {
        this.attackDescription = attackDescription;
    }
}
