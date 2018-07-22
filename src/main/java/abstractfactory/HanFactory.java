package abstractfactory;

/**
 * @author hellen
 * @date 2018/7/7
 */
public class HanFactory implements MyFactory {

    @Override
    public Castle createCastle() {
        return new HanCastle();
    }

    @Override
    public Army createArmy() {
        return new HanArmy();
    }

    @Override
    public King createKing() {
        return new HanKing();
    }
}
