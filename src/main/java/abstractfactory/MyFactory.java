package abstractfactory;

/**
 * @author hellen
 * @date 2018/7/8
 */
public interface MyFactory {
    Castle createCastle();
    Army createArmy();
    King createKing();

}
