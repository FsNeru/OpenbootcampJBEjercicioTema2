package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        getIVAProduct(200);


    }

    //IVA en Argentina = 21% del producto
    public static void getIVAProduct(double productPrice){
        double result = productPrice * (1.21d);
        double totalIva = result - productPrice;
        System.out.println("El IVA del producto es de :$"+ totalIva);
        System.out.println("El precio total del producto mas IVA es de :$"+ result);

    }
}
