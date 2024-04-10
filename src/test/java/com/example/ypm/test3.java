package com.example.ypm;

/**
 * description:
 *
 * @author ypm
 * @version 1.0
 * @see
 * @since JDK1.8
 * date 2024/4/10 11:15
 */
public class test3 {

    public double calculateTotalPrice(int apples, int strawberries, int mangoes) {
        double applePrice = 2.5;  // 苹果的单价（假设每斤价格为 2.5 元）
        double strawberryPrice = 4.0 * 0.8;  // 草莓限时打折，原价 4.0 元每斤
        double mangoPrice = 3.0;  // 芒果的单价

        double totalPrice = apples * applePrice + strawberries * strawberryPrice + mangoes * mangoPrice;

        return totalPrice;
    }

    public static void main(String[] args) {
        test3 cart = new test3();
        int apples = 2;  // 顾客购买的苹果斤数
        int strawberries = 3;  // 顾客购买的草莓斤数
        int mangoes = 1;  // 顾客购买的芒果斤数

        double total = cart.calculateTotalPrice(apples, strawberries, mangoes);
        System.out.println("Total price: " + total + "元");
    }
}
