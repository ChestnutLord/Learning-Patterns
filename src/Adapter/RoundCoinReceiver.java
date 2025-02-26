package Adapter;

public class RoundCoinReceiver {
    private int radius;

    public RoundCoinReceiver(int radius) {
        this.radius = radius;
    }

    public boolean receive(RoundCoin coin){
        if(radius >= coin.getRadius()){
            return true;
        }
        return false;
    }
}
