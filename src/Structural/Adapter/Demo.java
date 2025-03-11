package Structural.Adapter;

public class Demo {
    public static void main(String[] args) {
        RoundCoinReceiver roundCoinReceiver = new RoundCoinReceiver(5);

        RoundCoin roundCoin = new RoundCoin(4);
        SquareCoin squareCoin = new SquareCoin(3);

        SquareCoinAdapter squareCoinAdapter = new SquareCoinAdapter(squareCoin);

        if (roundCoinReceiver.receive(roundCoin)) {
            System.out.println("Круглая монета подходит");
        }

        if (roundCoinReceiver.receive(squareCoinAdapter)) {
            System.out.println("Квадратная монета подходит");
        }

    }
}
