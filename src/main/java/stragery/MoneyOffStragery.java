package stragery;

import java.math.BigDecimal;

/**
 * 满减折扣
 * @author hellen
 * @date 2018/7/22
 */
public class MoneyOffStragery implements BookDisCountStratery{
    @Override
    public BigDecimal getresultAmout(BigDecimal amount) {
        BigDecimal resultAmount = null;
        if(new BigDecimal("0").compareTo(amount) > 0){
            throw  new RuntimeException("金额不能小于0");
        }
        if(new BigDecimal("200").compareTo(amount) > 0){
            resultAmount = amount;
        }else {
            resultAmount = amount.subtract(new BigDecimal("50"));
        }
        return resultAmount;
    }
}
