package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
    }
    public DeluxePizza(boolean isVeg,int price,int nonVegePrice,int cheezeCharge, int toppingCharge, int takeCharge) {
        super(isVeg);
        super.price = price;
        super.nonVegePrice = nonVegePrice;
        super.cheezeCharge = cheezeCharge;
        super.toppingCharge = toppingCharge;
        super.takeCharge = takeCharge;
        addExtraCheese();
        addExtraToppings();
    }
}
