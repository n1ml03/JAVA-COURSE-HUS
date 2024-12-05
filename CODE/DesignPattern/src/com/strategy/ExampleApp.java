package com.strategy;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
        Context context = new Context();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        sc.close();

        switch (c) {
            case "+" -> context.setStrategy(new ConcreteStrategyAdd());
            case "-" -> context.setStrategy(new ConcreteStrategySubstract());
            case "*" -> context.setStrategy(new ConcreteStrategyMuliple());

        }
        int res = context.executeStrategy(a, b);
        System.out.println(res);

    }
}
