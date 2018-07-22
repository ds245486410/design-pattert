package builder;

/**
 * @author hellen
 * @date 2018/7/9
 */
public class BenzCarBuilder implements CarBuilder {
    private BenzCar benzCar = new BenzCar();
    @Override
    public void build() {
        System.out.println("is is building ");
    }

    @Override
    public BenzCar getresult() {
        return benzCar;
    }
}
