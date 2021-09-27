/*
A class that implements the given interfaces
 */

public class Ferrari implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;

    public Ferrari() {
        this.maxSpeed = 50;
    }

    @Override
    public String sound() {
        return "ZOOM!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 5;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }}
