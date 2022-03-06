package com.company;

public class Main {

    public static void main(String[] args) {
        float marsWeightMukucha;
        float earthWeightMukucha = 67;
        double marsWeightindouble;
        int marsWeightinInt;

        //Calculation of MarsWeight
        marsWeightMukucha = (earthWeightMukucha * 0.38F);
        System.out.println("marsWeightMukucha" + marsWeightMukucha);

        //from float to double
        marsWeightindouble = marsWeightMukucha;
        System.out.println("marsWeightMukucha:" + marsWeightindouble);

        //to 4 decimal places
        marsWeightindouble = marsWeightMukucha;
        System.out.println("Kilograms on Mars after conversion to double" + marsWeightindouble);


        //cast the above variable of double type to a new variable of int type,
        marsWeightinInt = (int) marsWeightindouble;
        System.out.println("Marsweight casted to Int:" + marsWeightinInt);

        // cast the above variable of type int to a new variable of type char
        char c = (char) marsWeightinInt;
        System.out.println("The ASCII table equivalent of marsWeightInInt is: " + c);

        //assign the value of performing some mathematical operation on the char character to the new int variable
        int exampleOfMathOnChar = c / c;
        System.out.println("An example of a mathematical operations on the char type: " + exampleOfMathOnChar);

    }

}

