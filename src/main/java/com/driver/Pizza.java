package com.driver;

public class Pizza {

    private int price;
    private int cheezeCharge;
    private int toppingsCharge;
    private int takeAwayCharge;
    private String bill;
    private boolean isVeg;
    private boolean isBillGenerated;
    private boolean isCheezeAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = isVeg ? 300 : 400;
        this.cheezeCharge = 80;
        this.toppingsCharge = isVeg ? 70 : 120;
        this.takeAwayCharge = 20;

        this.isCheezeAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheezeAdded==false) {
            this.price += this.cheezeCharge;
            isCheezeAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false) {
            this.price += this.toppingsCharge;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded) {
            this.price += this.takeAwayCharge;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false) {
            if(isCheezeAdded) {
                this.bill += "Extra Cheese Added: " + this.cheezeCharge + "\n";
            }
            if(isToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.toppingsCharge + "\n";
            }
            if(isTakeAwayAdded) {
                this.bill += "Paperbag Added: " + this.takeAwayCharge + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
