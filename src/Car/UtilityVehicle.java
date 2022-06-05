package Car;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }
    public boolean Drive() {
        return fourWheelDrive;
    }

}


