package Car;

public class with75KwBattery extends CarDecorator{

    public with75KwBattery(Car car){
        super(car);
    }

    @Override
    public String getSerialN() {
        return super.getSerialN();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with 75kw battery";
    }
}
