package lambdafunc;

public class Calculavel {

        static double efetuarCalculo(Calcular1 calc, double a, double b){
            return calc.calcular(a,b);
        }

    public static void main(String [] args){
            double  r = efetuarCalculo((a,b) -> a + b, 5, 7);
            System.out.println("R = " + r);

        }

}
