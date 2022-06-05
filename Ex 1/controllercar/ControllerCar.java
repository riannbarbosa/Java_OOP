
package controllercar;

public class ControllerCar {

    
    public static void main(String[] args) {
            

      Car car1 = new Car(2020, "Corsa", true, 1);
      
      /* Name: Rian Barbosa
      *  Enrollment Number: 2111100028
      *  Instructions: Car( YEAR, NAME, START VEHICLE (BOOLEAN), GEARS)
      */
       
       
       System.out.println(car1);
       System.out.println(car1.motorCheck());
       System.out.println(car1.marchaCheck());
       
    }
    
}
