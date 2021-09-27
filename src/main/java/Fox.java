/* maplemochi Tradeable/Domesticable class example */

public class Fox implements Domesticatable, Tradable{
    private int tails;

    public Fox(){
        this.tails = 9;
    }
    @Override
    public String sound(){
        return "Yip!";
    }

    @Override
    public int getPrice() {
        return this.tails * 10;
    }

    public int getTails() {
        return tails;
    }
}
