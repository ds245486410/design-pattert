package stragery;

import java.math.BigDecimal;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class DiscountStragery implements BookDisCountStratery {
    @Override
    public BigDecimal getresultAmout(BigDecimal amount) {
        if(BigDecimal.ZERO.compareTo(amount) > 0){
            throw new RuntimeException("金额小于0");
        }

        return new BigDecimal("0.8").multiply(amount);
    }
}
