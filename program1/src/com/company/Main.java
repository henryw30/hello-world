package com.company;

public class Main {


    public static void main(String[] args) {
	    int a = 5;
        int b = 3;

        String hippo = "Roadhog";
        System.out.println(hippo);

        Pizza pizzaObj = new Pizza(a, b);
        Pizza newObj = pizzaObj;

        System.out.println(newObj.calcSum());
        pizzaObj.changeValues(1,2);

        System.out.println(newObj.calcSum());




        for( int i = 0; i < hippo.length(); i++){
            System.out.print(hippo.charAt(i)+" ");
        }
    }
}
