import Car.Sedan;
import Car.Truck;
import Car.UtilityVehicle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal result = BigDecimal.valueOf(6.258);
        System.out.println(redondeo(result));
        System.out.println(change(result));

        Sedan sedan = new Sedan(100, "Lamborghini","Gallardo",200);
        UtilityVehicle utilityVehicle = new UtilityVehicle(200, "Mercedes-Benz", "Sprinter",200, true);
        Truck truck = new Truck(300, "Renault", "Master", 200, 1689);

        System.out.println(sedan.getMake());
        System.out.println(truck.towCapacity());
        System.out.println(utilityVehicle.Drive());


    }
    public static BigDecimal redondeo(BigDecimal num) {

        BigDecimal result = new BigDecimal(String.valueOf(num));
        return num.setScale(2, RoundingMode.HALF_UP);

    }

    public static BigDecimal change(BigDecimal num) {

        BigDecimal neg = new BigDecimal(-1);
        BigDecimal result = new BigDecimal(String.valueOf(num));
        return result.multiply(neg).setScale(1, RoundingMode.HALF_UP);
    }
}
