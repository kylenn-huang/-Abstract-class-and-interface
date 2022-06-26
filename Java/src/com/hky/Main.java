package com.hky;

public class Main {

    public static void main(String[] args) {
        /*
         * 假设全买小鸡，最多能买300只 全买公鸡，最多能买20只 全买母鸡，最多能买33只 三个变量：小鸡x 公鸡g 母鸡m
         */
        for (int x = 3; x < 100; x = x + 3) { // 小鸡的个数肯定是3的倍数，所以x的变化是已3的倍数递增
            for (int g = 1; g < 20; g++) {
                for (int m = 1; m < 33; m++) {
                    if (x + g + m == 100 && x / 3 + 5 * g + 3 * m == 100) { // 个数和总价都为100
                        System.out.println("公鸡数量：" + g + "，母鸡数量：" + m + "，小鸡数量：" + x);
                    }
                }
            }
        }
        System.out.println("=================================================================");
        Main main = new Main();
        String ways = main.gotoBeijing(500);
        System.out.println(" 前往北京的方式有：" +ways);
    }

    public String gotoBeijing(int money){
        StringBuffer buffer = new StringBuffer();
        if (money >= 300) {
            buffer.append("公共汽车、");
        }
        if (money >= 400){
            buffer.append("火车、");
        }
        if (money >= 500){
            buffer.append("自驾、");
        }
        if (money >= 1000){
            buffer.append("飞机");
        }
        return buffer.toString();
    }
}
