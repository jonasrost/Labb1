import java.awt.*;

/***
 * An abstract class that represents a car, which implements the interface 'Movable'.
 */
public abstract class Car implements Movable{

    /*** Number of doors on the car */
    protected int nrDoors;
    /*** Engine power of the car */
    protected double enginePower;
    /*** The current speed of the car */
    protected double currentSpeed;
    /*** Color of the car */
    protected Color color;
    /*** The car model name */
    protected String modelName;

    /*** The start x coordinate of the car */
    protected double xCord = 0;
    /*** The start y coordinate of the car */
    protected double yCord = 0;

    /*** Initializes the start direction of the car */
    protected int direction = NORTH;

    /***
     * Constructor of the class
     * @param nrDoors the number of doors the car has
     * @param enginePower represents the engine power of the car
     * @param colour the color of the car
     * @param modelName the model of the car
     */
    public Car(int nrDoors, double enginePower, Color colour, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = colour;
        this.modelName = modelName;
        this.xCord = 0;
        this.yCord = 0;
        stopEngine();

        // Fills the arrays with values corresponding to a correct left respective right turn,
        // based on what direction the car is facing.
        LEFTTURN[NORTH] = WEST;
        LEFTTURN[EAST] = NORTH;
        LEFTTURN[SOUTH] = EAST;
        LEFTTURN[WEST] = SOUTH;

        RIGHTTURN[NORTH] = EAST;
        RIGHTTURN[EAST] = SOUTH;
        RIGHTTURN[SOUTH] = WEST;
        RIGHTTURN[WEST] = NORTH;
    }

    /***
     * Returns the number of doors of the car.
     * @return the number of doors of the car
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /***
     * Returns the engine power of the car.
     * @return the engine power of the car
     */
    public double getEnginePower(){
        return enginePower;
    }

    /***
     * Returns the current speed of the car.
     * @return the current speed of the car
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /***
     * Returns the color of the car.
     * @return the color of the car
     */
    public Color getColor(){
        Color clr = this.color;
        return clr;
    }

    /***
     * Allows the user to change the color of the car to clr.
     * @param clr the new color of the car
     */
    public void setColor(Color clr){
        color = clr;
    }

    /***
     * Sets currentSpeed to 0.1.
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /***
     * Sets currentSpeed to 0.
     */
    private void stopEngine(){
        currentSpeed = 0;
    }

    /***
     * Abstract method to enable overriding in subclasses
     * @param amount used as an multiplicator
     */
    public void incrementSpeed(double amount) {}

    /***
     * Abstract method to enable overriding in subclasses
     * @param amount used as an multiplicator
     */
    public void decrementSpeed(double amount) {}

    /***
     * Method used to accelerate the car
     * @param amount value to accelerate the car by
     */
    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount <= 1 && amount >=0)
            incrementSpeed(amount);
    }

    /***
     * Method used to deaccelerate the car
     * @param amount value to deaccelerate by
     */
    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount <= 1 && amount >=0)
            this.decrementSpeed(amount);
    }

    /***
     * Moves the car a distance currentSpeed in the direction it is facing.
     */
    public void move() {
        if (direction == NORTH)
            yCord = yCord + currentSpeed;
        else if (direction == EAST)
            xCord = xCord + currentSpeed;
        else if (direction == SOUTH)
            yCord = yCord - currentSpeed;
        else
            xCord = xCord - currentSpeed;
    }

    /***
     * Changes the direction which the car is facing 90 degrees to the left.
     */
    public void turnLeft() {
        this.direction = LEFTTURN[direction];
    }

    /***
     * Changes the direction which the car is facing 90 degrees to the right.
     */
    public void turnRight() {
        this.direction = RIGHTTURN[direction];
    }

    /***
     * Returns the current x-coordinate of the car
     * @return the value of xCord
     */
    public double getXCoordinate(){
        return this.xCord;
    }

    /***
     * Returns the current y-coordinate of the car
     * @return the value of yCord
     */
    public double getYCoordinate(){
        return this.yCord;
    }
}
