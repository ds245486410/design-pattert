package builder;

/**
 * @author hellen
 * @date 2018/7/9
 */
public class BenzCarCreator {
    private CarBuilder carBuilder;

    public BenzCarCreator(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public BenzCar constract(){
        carBuilder.build();
        BenzCar car = carBuilder.getresult();
        car.setName("benzcar");
        car.setType("super");
        return car;
    }

    public static void main(String[] args) {
        BenzCarCreator creator = new BenzCarCreator(new BenzCarBuilder());
        BenzCar constract = creator.constract();

    }
}
