public abstract class Character {

    // Instance variables
    private String name;
    private String className;
    private int currentHealth;
    private int maxHealth;
    private int strength;
    private int defense;
    private int special;
    private int points;
    
    // NEW in Character 2.0!!!
    // An array that will hold the opponents info
    //    [currentHealth, maxHealth, strength, defense, special, points]
    private int[] oppInfo;
    // END NEW    


    // Getters and setters
    
    // NEW in Character 2.0!!!
    public int[] getOppInfo() {
        return oppInfo;
    }
    // END NEW    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // Other methods


    @Override
    public String toString() {
        return  "name='" + name +
                ", className=" + className +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", strength=" + strength +
                ", defense=" + defense +
                ", special=" + special +
                ", points=" + points;
    }

    public abstract double attack();
    public abstract double defend();
    public abstract void specialEffect();
    
    // NEW in Character 2.0!!!
    // This method will receive the stats from an opponent
    // and will load the oppInfo array
    public void loadOppInfo(int[] oppStats) {
//      oppInfo[] = new int[oppStats.length]; // THIS IS A TYPO!!!!
        oppInfo = new int[oppStats.length];
    }
    // END NEW


}









