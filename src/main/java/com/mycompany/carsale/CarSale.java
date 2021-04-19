package com.mycompany.carsale;

import java.util.Scanner;

public class CarSale {
    String name;
    Integer year;
    Double km;
    String color;
    String fuel;
    String brand;
    Double price, newPrice;
    String answer;
    Integer count = 1;
    
    Scanner read = new Scanner(System.in);

    void changeColor() {
        System.out.println("originally this car is black, would you "
                + "like to change it ? Y/N");
        answer = read.next();
        if (answer.equals("Y")) {
            System.out.println("The available colors are red, "
                    + "blue or green, witch one do you like to pick ?");
            color = read.next();
            System.out.println("Car info updated:");
            carInfo();
            }else{carInfo();}
    }

    void carInfo() {
        System.out.println("Car Info:");
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Km: " + km);
        System.out.println("Color: " + color);
        System.out.println("Fuel: " + fuel);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        if(count == 1){
           count++; 
        System.out.println("Do you want to buy this car ? Y/N");
        String answer = read.next();
        if (answer.equals("Y")) {
            changeColor();
        }else {
          System.out.println("Thank you for using our services ;D");
        }  
         } else {
            System.out.println("As you first purchase you have a 10% discount, would you like to use it ? Y/N");
              answer = read.next();
        } if (answer.equals("Y")) {
            newPrice = price -(price * 0.10);  
            
            System.out.println("The amount to be paid is:"+newPrice);
            return;
        }else {
            System.out.println("The amount to be paid is:"+price);      
    }   
    }
   
    public static void main(String[] args) {

        CarSale civicHonda = new CarSale();
        CarSale corollaToyota = new CarSale();
        CarSale palioFiat = new CarSale();

        civicHonda.name = "Civic";
        civicHonda.year = 2019;
        civicHonda.km = 20000.0;
        civicHonda.color = "Black";
        civicHonda.fuel = "Gasoline and alcohol";
        civicHonda.brand = "HONDA";
        civicHonda.price = 130000.0;

        corollaToyota.name = "Corolla";
        corollaToyota.year = 2016;
        corollaToyota.km = 40000.0;
        corollaToyota.color = "Black";
        corollaToyota.fuel = "Gasoline and alcohol";
        corollaToyota.brand = "TOYOTA";
        corollaToyota.price = 50000.0;

        palioFiat.name = "Palio";
        palioFiat.year = 2010;
        palioFiat.km = 100000.0;
        palioFiat.color = "Black";
        palioFiat.fuel = "Gasoline and alcohol";
        palioFiat.brand = "FIAT";
        palioFiat.price = 20000.0;

        System.out.println("These are the cars we have available at the moment:"
                + "\n Enter the name of the car you want to know more "
                + "\n Civic "
                + "\n Corolla "
                + "\n Palio");
        
        Scanner readCar = new Scanner(System.in);
        String read = readCar.next();

        switch (read) {
            case "Civic":
                civicHonda.carInfo();
                break;
            case "Corolla":
                corollaToyota.carInfo();
                break;
            case "Palio":
                palioFiat.carInfo();
                break;
        }
    }
}
