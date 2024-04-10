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
public class test1 {
    public static void main(String[] args) {

        System.out.println(calculateTotalPrice(2, 3));
    }
    public static int calculateTotalPrice(int applesWeight, int strawberriesWeight) {
        if (applesWeight < 0 || strawberriesWeight < 0) {
            return -1; // 返回-1表示输入数据错误
        }
        int applePrice = 8;
        int strawberryPrice = 13;

        int totalPrice = applesWeight * applePrice + strawberriesWeight * strawberryPrice;
        System.out.println(totalPrice);
        return totalPrice;

    }

}
