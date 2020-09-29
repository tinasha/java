package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

import java.util.Scanner;

public class CalculatorServiceImpl implements CalculatorService {
   // private static CalculatorService Operations;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x, y, z=0;
        int operation;

        System.out.println("პირველი რიცხვი:");
        x = getInput(sc);
        System.out.println("მეორე რიცხვი:");
        y = getInput(sc);
        System.out.println("1) X+Y\t 2)X/Y");

        operation =  (int)getInput(sc);


        sc.close();

        switch (operation){
            case 1:
                z = CalculatorService.sum(x,y);
                break;
            case 2:
                z = CalculatorService.divide(x,y);
                break;
        }
        System.out.println("შედეგი: " + z);
    }

    private static double getInput(Scanner sc) {
        return sc.nextDouble();
    }

}