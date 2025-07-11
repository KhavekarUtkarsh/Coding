//Assignment-10

public class TestFactoryPattern{
    public static void main(String args[]){
        System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.SUV));
    }
}
abstract class Car{
    public Car(CarType model){
        this.model=model;
        arrangeParts();
    }
    private void arrangeParts(){
        System.out.println("\narrangeParts is called.");
    }
    protected abstract void construct();
    private CarType model=null;
    public CarType getModel(){
        return model;
    }
    public void setModel(CarType model){
        this.model=model;
    }
}
class CarFactory{
    public static Car buildCar(CarType model){
        Car car=null;
        switch(model){
            case HATCHBACK: car=new HatchbackCar();
                            break;
            case SEDAN: car=new SedanCar();
                        break;
            case SUV: car=new SuvCar();
                        break;
            default: System.out.println("\nError: Car type doesn't match!");
        }
        return car;
    }
}
enum CarType{
    HATCHBACK, SEDAN, SUV
}
class SuvCar extends Car{
    SuvCar(){
        super(CarType.SUV);
        construct();
    }
    protected void construct(){
        System.out.println("\nBuilding SUV Car!");
        System.out.println("\nSpoiler is Added!");
        System.out.println("\nRear Camera is Added!");
        System.out.println("\nHill Assist is Added!");
    }
}
class SedanCar extends Car{
    SedanCar(){
        super(CarType.SEDAN);
        construct();
    }
    protected void construct(){
        System.out.println("\nBuilding Sedan Car!");
        System.out.println("\nBoot Space is Added!");
        System.out.println("\nPower Window is Added!");
        System.out.println("\nParking Assist is Added!");
    }
}
class HatchbackCar extends Car{
    HatchbackCar(){
        super(CarType.HATCHBACK);
        construct();
    }
    protected void construct(){
        System.out.println("\nBuilding Hatchback Car!");
        System.out.println("\nAlloy Wheels are Added!");
        System.out.println("\nPower Tail Gate is Added!");
        System.out.println("\nAdjustible Seat Belt are Added!");
    }
}