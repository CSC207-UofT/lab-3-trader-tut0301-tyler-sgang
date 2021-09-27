/* A class implementing Drivable, Domesticatable, Tradable using the given interfaces */

public class Dragon implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;

    public Dragon() { this.maxSpeed = 1000; }

    @Override
    public String sound() { return "eeaaaa"; }

    @Override
    public void upgradeSpeed() { this.maxSpeed += 10 ; }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 90000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }
}
