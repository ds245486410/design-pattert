package abstractfactory;

/**
 * @author hellen
 * @date 2018/7/7
 */
public class HanKing implements King {
    @Override
    public void order() {
        System.out.println("han king gives orders");
    }
}
