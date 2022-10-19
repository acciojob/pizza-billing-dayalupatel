package com.driver;

public class Main {
  public static void main(String[] args) {
    //DeluxePizza dp = new DeluxePizza(true);
    DeluxePizza dp = new DeluxePizza(true, 300, 350, 80, 70, 20);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    //Pizza p = new Pizza(true);
    Pizza p = new Pizza(true, 300, 350, 80, 70, 20);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}