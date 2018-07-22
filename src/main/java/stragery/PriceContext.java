package stragery;

import java.math.BigDecimal;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class PriceContext {
    private BookDisCountStratery disCount;

    public void setDisCount(BookDisCountStratery disCount) {
        this.disCount = disCount;
    }

    public BigDecimal settletAmount(BigDecimal amount){
        BigDecimal resultAmout = disCount.getresultAmout(amount);
        System.out.println(resultAmout);
        return resultAmout;
    }
}
