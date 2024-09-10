
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Vehicle vehicle_1 = new Vehicle("Camaro", true,false,true);
    Vehicle vehicle_2 = new Vehicle("Audi",false,false,false);
    Vehicle vehicle_3 = new Vehicle("Corvette", true,true,true);

    System.out.println(vehicle_1.toString());
    System.out.println(vehicle_2.toString());
    System.out.println(vehicle_3.toString());

    }
}