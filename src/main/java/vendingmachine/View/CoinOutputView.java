package vendingmachine.View;

import vendingmachine.Constant.OutputConstant;
import vendingmachine.Domain.Coin;
import vendingmachine.Domain.HoldingCoins;

public class CoinOutputView {

    public static void printHoldingCoins() {
        System.out.println(OutputConstant.PRINT_COIN);

        StringBuilder result = new StringBuilder();
        for (Coin c : Coin.values()) {
            result.append(printCoin(c));
        }

        System.out.println(result);
    }

    private static String printCoin(Coin c) {
        StringBuilder result = new StringBuilder();
        result.append(c.printAmount());
        result.append(OutputConstant.COIN_STANDARD);
        result.append(HoldingCoins.printCoinCount(c));
        result.append("\n");

        return result.toString();
    }
}
