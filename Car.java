/**
 *Java basic: HomeWork8a
 *
 @author Muzaffar Eshonqulov
 @todo 28.09.2022
 @date 4.10.2022
 *
 */
public class Car {
    public static void main(String[] args) {
        Mercedes car = new Mercedes("mercedes:", "on & off"," black");
        System.out.println(car);
        System.out.println("The car trying to be :" + car.ignition);
        car.oil();
        System.out.println("Oil: no oil");
        System.out.println("The car trying to be :" + car.isIgnition());
        car.control();
        System.out.println(car.control());

    }
}
