package vendingmachine.Domain;

import vendingmachine.Constant.OutputConstant;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Coin {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    public static List<Integer> getAmountList() {
        return Stream.of(values())
                .map(c -> c.amount)
                .collect(Collectors.toList());
    }

    public static Coin getCoinByAmount(int target) {
        return Stream.of(Coin.values())
                .filter(c -> c.amount == target)
                .findFirst()
                .orElse(null);
    }

    public int getAmount() {
        return amount;
    }

    public int calculateTotalAmount(int count) {
        return amount * count;
    }

    public String printAmount() {
        return amount + OutputConstant.COIN_AMOUNT;
    }

}
