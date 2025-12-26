/*
 * This is the program is the Animal class.
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-12-10
 */

public abstract class Animal {
    /**
     * defines color of animal.
     */
    private String color;

    /**
     * defines name of animal.
     */
    private String name;

    /**
     * tracks current speed of animal.
     */
    private int speed;

    /**
     * holds how much health and animal has.
     */
    private int health;

    /**
     * holds animal defense.
     */
    private int defense;

    /**
     * holds animal attackPower.
     */
    private int attackPower;

    /**
     * holds attackAccuracy.
     */
    private int attackAccuracy;

    /**
     * holds animal elvation.
     */
    private int height;

    /**
     * holds fall counter.
     */
    private int fallCounter;

    /**
     * holds fall distance.
     */
    private int fallDistance;

    /**
     * holds damage done to enemy.
     */
    private int damage;

    /**
     * holds the distance traveled during one turn.
     */
    private int distanceTravelled;

    /**
     * holds forced movement of animal.
     */
    private int forcedMovement;

    /**
     * sets default values for animals.
     *
     * @param setColor
     * @param setName
     * @param setHealth
     * @param setDefense
     */
    public Animal(final String setColor, final String setName,
                    final int setHealth, final int setDefense) {
        this.color = setColor;
        this.name = setName;
        this.health = setHealth;
        this.defense = setDefense;
    }

    /**
     * gets animal color.
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * gets animal name.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * gets animals current speed.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * gets animal health.
     *
     * @return health
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * gets animal defense.
     *
     * @return defense
     */
    public int getDefense() {
        return this.defense;
    }

    /**
     * gets animal attack power.
     *
     * @return attackPower
     */
    public int getAttackPower() {
        return this.attackPower;
    }

    /**
     * gets animal attack accuracy.
     *
     * @return attackAccuracy
     */
    public int getAttackAccuracy() {
        return this.attackAccuracy;
    }

    /**
     * gets animal elvation.
     *
     * @return height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * gets aniamal fall distance.
     *
     * @return fallDistance
     */
    public int getFallDistance() {
        return this.fallDistance;
    }

    /**
     * gets damage dealt.
     *
     * @return damage
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * gets distance traveled.
     *
     * @return distanceTravelled
     */
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    /**
     * gets forced movement.
     *
     * @return forcedMovement
     */
    public int getForcedMovement() {
        return this.forcedMovement;
    }

    /**
     * sets speed.
     *
     * @param setSpeed
     */
    public void setSpeed(final int setSpeed) {
        this.speed = setSpeed;
    }

    /**
     * sets health.
     *
     * @param setHealth
     */
    public void setHealth(final int setHealth) {
        this.health = setHealth;
    }

    /**
     * sets defence.
     *
     * @param setDefense
     */
    public void setDefense(final int setDefense) {
        this.defense = setDefense;
    }

    /**
     * sets attack power.
     *
     * @param setAttackPower
     */
    public void setAttackPower(final int setAttackPower) {
        this.attackPower = setAttackPower;
    }

    /**
     * sets attack accuracy.
     *
     * @param setAttackAccuracy
     */
    public void setAttackAccuracy(final int setAttackAccuracy) {
        this.attackAccuracy = setAttackAccuracy;
    }

    /**
     * sets height.
     *
     * @param setHeight
     */
    public void setHeight(final int setHeight) {
        this.height = setHeight;
    }

    /**
     * sets fall counter.
     *
     * @param setFallCounter
     */
    public void setFallCounter(final int setFallCounter) {
        this.fallCounter = setFallCounter;
    }

    /**
     * sets fall distance.
     *
     * @param setFallDistance
     */
    public void setFallDistance(final int setFallDistance) {
        this.fallDistance = setFallDistance;
    }

    /**
     * sets damage delt.
     *
     * @param setDamage
     */
    public void setDamage(final int setDamage) {
        this.damage = setDamage;
    }

    /**
     * sets distance travelled.
     *
     * @param setDistanceTravelled
     */
    public void setDistanceTravelled(final int setDistanceTravelled) {
        this.distanceTravelled = setDistanceTravelled;
    }

    /**
     * sets forced movement.
     *
     * @param setForcedMovement
     */
    public void setForcedMovement(final int setForcedMovement) {
        this.forcedMovement = setForcedMovement;
    }

    /**
     * all animals will be able to slow down.
     *
     * @param brakePower
     * @param brakeTime
     * @param brakeTimeReduction
     * @return speed
     */
    public abstract int brake(int brakePower,
                    int brakeTime, int brakeTimeReduction);

    /**
     * all animals will be able to speed up.
     *
     * @param accelerationPower
     * @param accelerationTime
     * @return speed
     */
    public abstract int accelerate(int accelerationPower,
                    int accelerationTime);

    /**
     * all animals will have a special ability.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public abstract int specialAbility(String enemyAttacked,
                    int specialDamage);

    /**
     * all animals can climb.
     *
     * @return height
     */
    public abstract int climb();

    /**
     * all animals have a special movement.
     *
     * @return distanceTravelled
     */
    public abstract int specialMovement();

    /**
     * base attack.
     *
     * @param setAttackPower
     * @param setAttackAccuracy
     * @param animalDefense
     * @param enemyAttacked
     * @return attackPower or 0
     */
    public int basicAttack(final int setAttackPower,
                    final int setAttackAccuracy, final int animalDefense,
                    final String enemyAttacked) {
        System.out.println("The " + this.name + " uses a basic attack on the "
                        + enemyAttacked + ".");
        if (attackAccuracy >= animalDefense) {
            return attackPower;
        }
        return 0;
    }

    /**
     * animal gets hurt.
     *
     * @return health
     */
    public int damageTaken() {
        if (this.damage != 0)  { // checks if attack missed
            this.health = this.health - this.damage;
            System.out.println("The " + this.name + " takes " + this.damage
                            + " damage!");
            this.damage = 0;
            return this.health;
        } else {
            System.out.println("The attack missed the " + this.name + ".");
            return this.health;
        }
    }

    /**
     * animal falls.
     *
     * @param fallDamageMultiplyer
     * @return health
     */
    public int falling(final int fallDamageMultiplyer) {
        this.height = this.height - this.fallDistance;
        this.fallCounter += 1;
        if (this.height != 0) {
            System.out.println("The " + this.name + " falls down "
                            + this.fallDistance
                            + " feet towards the ground,\nnow the " + this.name
                            + " is " + this.height
                            + " feet above the ground.");
        } else {
           this.health = this.health - this.fallCounter
                   * fallDamageMultiplyer;
           System.out.println("The " + this.name + "  hits the ground"
                           + " and takes " + (this.fallCounter
                                   * fallDamageMultiplyer)
                           + " fall damage.");
           this.fallCounter = 0;
        }
        return this.health;
    }

    /**
     * animals movement when forced to movement.
     */
    public void forcedMovement() {
        System.out.println("The " + this.name + " is moved "
                        + this.forcedMovement + " feet.");
        this.forcedMovement = 0;
    }
}
