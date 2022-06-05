
package controllercar;

// Child class for vehicle status

public class Car extends innerVehicle{
    
    private int Ano;
    public String Modelo;
    
    
    

    public Car(int Ano, String Modelo, boolean motorLigado, int Marchas){
        super();
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.motorLigado = motorLigado;
        this.Marchas = Marchas;
    }
    
    @Override
    public String toString(){
        String str = "------ [ " + this.Modelo.toUpperCase()+ " ] ------";
        str +=  "\n------ Ano: "+ getAno() +" ------ ";
        
        return str;
        
    }
 
    // Setters
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public void setAno(int Ano){
        this.Ano = Ano;
        
    }   
    
    // Getters
    
    public int getAno(){
        return Ano;
    }
    public String getModelo(){
        return Modelo;
    }
  
}
