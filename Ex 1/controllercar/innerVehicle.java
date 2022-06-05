package controllercar;


/* Parent class for vehicle operation.
 * Vehicle brain(Every vehicle (Car)
 * must have engine and gear as main function).
 */

public class innerVehicle  {
    
     
   
    public  boolean motorLigado;
    public int Marchas;
   
    
   
    // Start Vehicle / Check if the vehicle is on
   public String motorCheck(){
        
       if(motorLigado){
           return "---- Motor: LIGADO ----";
                
       }    
        return "-- Motor: DESLIGADO ---";
    
}
   // Function of the Gears
   public String marchaCheck(){
        
         if(motorLigado){
               
                switch (Marchas) {
                    case 1 -> {
                         return "\nMarcha 1: \nSeu carro pode andar ate  20km/h a partir de agora";
                    }
                    case 2 -> {
                         return "\nMarcha 2: \nSeu carro pode andar ate 40km/h a partir de agora";
                    }
                    case 3 -> {
                         return "\nMarcha 3: \nSeu carro pode andar entre 40km/h a 50km/h, a partir de agora" ;
                    }
                    case 4 -> {
                         return "\nMarcha 4: \nSeu carro pode andar ate 60km/h, a partir de agora" ;
                    }
                    default -> {return "\nNo ponto morto, coloque  na marcha 1, de 1 a 4";
                    }
                }
                
                }
                return "\nSeu veiculo esta desligado!";
            
}
        // Setters
   
     public void setMarcha(int Marchas){
       this.Marchas = Marchas;
   }
  
    public void setMotorDesligado(boolean motorLigado){
       this.motorLigado = motorLigado;
   }
    
}
