package Structural.Adapter;

public class SquareCoinAdapter extends RoundCoin{
    private int radius;

    public SquareCoinAdapter(SquareCoin squareCoin) {
        this.radius=squareCoin.getRadius();
    }

    public int getRadius() {
        return radius;
    }

}
