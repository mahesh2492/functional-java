package functional.discount;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
/*
* find the total of prices greater than $20, discounted by 10%.
* */
public class DiscountFunctional {

    private static BigDecimal getTotal(List<BigDecimal> prices) {
        return prices
                .stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static void main(String[] args) {
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("12"), new BigDecimal("15"),
                new BigDecimal("20"), new BigDecimal("18"), new BigDecimal("25"),
                new BigDecimal("30"), new BigDecimal("48"), new BigDecimal("21")
        );

        System.out.println("Total of discounted prices " + getTotal(prices));
    }
}
