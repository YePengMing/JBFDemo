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
public class test4 {
    public static void main(String[] args) {
        int applesBought = 3;  // 顾客D购买了3斤苹果
        int strawberriesBought = 2;  // 顾客D购买了2斤草莓
        int mangoesBought = 10;  // 顾客D购买了10斤芒果

        double totalPrice = ShoppingCart.calculateTotalPrice(applesBought, strawberriesBought, mangoesBought);
        System.out.println("顾客D购买的水果总价为：" + totalPrice + "块");
    }



    static class ShoppingCart {
        public static double calculateTotalPrice(int apples, int strawberries, int mangoes) {
            double applePricePerKg = 5.0;  // 苹果价格每斤为5块
            double strawberryPricePerKg = 8.0;  // 草莓价格每斤为8块
            double mangoPricePerKg = 10.0;  // 芒果价格每斤为10块
            double totalPrice = apples * applePricePerKg + strawberries * strawberryPricePerKg + mangoes * mangoPricePerKg;

            // 考虑满100减10的优惠
            if (totalPrice >= 100) {
                totalPrice -= 10;
            }

            return totalPrice;
        }    }

}
