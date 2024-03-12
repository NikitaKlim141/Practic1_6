package com.mycompany.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Student Nikita Klimov, RIBO-01-22, Variant 1");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите марку автомобиля: ");
        String brandInput = scanner.nextLine();
        
        Car car = new Car(brandInput);
        CarService.modify(car);
        
        System.out.println(car.getBrand());
    }
}