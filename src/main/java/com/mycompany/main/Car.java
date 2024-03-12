
package com.mycompany.main;


class Car {
    private String brand;
    
    public Car(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void modifyBrand() {
        this.brand = this.brand.replace("a", "o")
                               .replace("i", "e")
                               .toUpperCase();
    }
}

class CarService {
    public static void modify(Car car) {
        car.modifyBrand();
    }
}
