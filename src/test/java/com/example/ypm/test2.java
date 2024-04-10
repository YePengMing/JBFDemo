package com.example.ypm;

/**
 * description:
 *
 * @author ypm
 * @version 1.0
 * @see
 * @since JDK1.8
 * date 2024/4/10 11:12
 */
public class test2 {
    public static int calculateTotalPrice(int apples, int strawberries, int mangoes) {
        int applePrice = 10; // 10元/斤
        int strawberryPrice = 15; // 15元/斤
        int mangoPrice = 20; // 20元/斤

        int totalApplePrice = applePrice * apples;
        int totalStrawberryPrice = strawberryPrice * strawberries;
        int totalMangoPrice = mangoPrice * mangoes;

        return totalApplePrice + totalStrawberryPrice + totalMangoPrice;
    }

    public static void main(String[] args) {
        int total = calculateTotalPrice(2, 3, 1);
        System.out.println("Total price is: " + total + "元");
    }
}
