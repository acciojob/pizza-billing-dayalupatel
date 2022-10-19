package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isTakeAwayAdded = false;
    private int takeCharge;
    private int totalTakeCharge;
    private boolean isCheezeAdded = false;
    private int cheezeCharge;
    private int totalCheezeCharge;
    private boolean isToppingAdded = false;
    private int toppingCharge;
    private int totalToppingCharge;
    private String[] billArr =  new String[5];

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price = isVeg ? 300 : 400;
        cheezeCharge = 80;
        toppingCharge = isVeg ? 70 : 120;
        takeCharge = 20;
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheezeAdded) {
            totalCheezeCharge += cheezeCharge;
            billArr[1] = "Extra Cheese Added: " + totalCheezeCharge;
        } else {
            totalCheezeCharge = cheezeCharge;
            billArr[1] = "Extra Cheese Added: " + cheezeCharge;
            isCheezeAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded) {
            totalToppingCharge += toppingCharge;
            billArr[2] = "Extra Toppings Added: " + toppingCharge;
        } else {
            totalToppingCharge = toppingCharge;
            billArr[2] = "Extra Toppings Added: " + toppingCharge;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded) {
            totalTakeCharge = takeCharge;
            billArr[3] =  "Paperbag Added: " + takeCharge;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        billArr[0] = "Base Price of Pizza: " + price;

        bill = billArr[0];
        for(int i=1;i<5;i++) {
            if( billArr[i] != null )
               bill = bill + "\n" + billArr[i];
        }
        int total = price + totalCheezeCharge + totalToppingCharge + totalTakeCharge;
        billArr[4] = "Total Price: " + total;

        bill = bill + "\n" + billArr[4];

        return this.bill;
    }
}
