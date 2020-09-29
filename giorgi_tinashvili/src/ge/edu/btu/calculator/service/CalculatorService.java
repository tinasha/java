package ge.edu.btu.calculator.service;

public interface CalculatorService {
    static double sum(double x, double y){
        try {
            return x+y;
        } catch (ArithmeticException er) {


            System.out.println("error" + er);
        }
        return x;
    }
    static double divide(double x, double y){
        try {
            return x / y;
        } catch (ArithmeticException e) {

            System.out.println("Erro" + e);


        }
        return x;
    }
}
