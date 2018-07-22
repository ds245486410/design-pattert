package abstractfactory;

/**
 * @author hellen
 * @date 2018/7/8
 */
public class TangFactory implements MyFactory {
    @Override
    public Castle createCastle() {
        return new TangCastle();
    }

    @Override
    public Army createArmy() {
        return new TangArmy();
    }

    @Override
    public King createKing() {
        return new TangKing();
    }
}
