package stragery;

import java.math.BigDecimal;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Client {
    public static void main(String[] args) {
        PriceContext priceContext = new PriceContext();
        priceContext.setDisCount(new MoneyOffStragery());
        priceContext.settletAmount(new BigDecimal("300"));

        priceContext.setDisCount(new DiscountStragery());
        priceContext.settletAmount(new BigDecimal("300"));
    }
}
