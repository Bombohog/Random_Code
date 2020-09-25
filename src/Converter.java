/********************************************
* Project description
* 
* Created by: Lasse J. Kongsdal
* Date: 18-09-2020
* 
* Description of program
********************************************/

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner currencyInput = new Scanner(System.in);

        System.out.println("Input country one (En): ");
        String firstCurrency = currencyInput.next();
        System.out.println("Input country two (Da): ");
        String secondCurrency = currencyInput.next();

        Scanner moneyInput = new Scanner(System.in);

        System.out.println("Input money: ");
        double Value = moneyInput.nextDouble();

        System.out.println("Converted amount = " + Converter(firstCurrency, secondCurrency, Value));

    }

    public static double Converter(String currency1, String currency2, double value){

        double conversionAmount1 = 1;
        double conversionAmount2 = 1;

        switch (currency1) {
            case "En":
                conversionAmount1 = 7;
                break;
            case "Da":
                conversionAmount1 = 1;
                break;


        }

        switch (currency2) {
            case "En":
                conversionAmount1 = 7;
                break;
            case "Da":
                conversionAmount1 = 1;
                break;


        }

        double convertedAmount = (value * conversionAmount1) / conversionAmount2;

        return convertedAmount;
    }

}
