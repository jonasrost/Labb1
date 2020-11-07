import java.awt.*;

public abstract class Car implements Movable{

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    protected double xCord = 0; // The start x coordinate of the car
    protected double yCord = 0; // The start y coordinate of the car

    protected int direction = NORTH; // Initializes the start direction of the car

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

        // Fills the arrays with values corresponding to a correct left respective right turn, based on
        // what direction the car is facing.
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
     * @return
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /***
     * Returns the engine power of the car.
     * @return
     */
    public double getEnginePower(){
        return enginePower;
    }

    /***
     * Returns the current speed of the car.
     * @return
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /***
     * Returns the color of the car.
     * @return
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
}
