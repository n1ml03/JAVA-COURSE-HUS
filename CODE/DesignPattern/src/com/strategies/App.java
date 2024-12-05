package com.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader
            = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.println("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 − CPU" + "\n" +
                        "3 − HDD" + "\n" +
                        "4 − Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Do you wish to cotinue selecting product? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n"
                        + "1 − PalPay" + "\n"
                        + "2 − C r e di t Card");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                    order.processOrderUsingPayPal((PayByPayPal) strategy);
                } else {
                    strategy = new PayByCreditCard();
                    order.processOrderUsingCreditCard((PayByCreditCard) strategy);
                }
            }

            System.out.println("Pay " + order.getTotalCost()
                    + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (strategy.pay(order.getTotalCost())) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("FAIL! Please, check your data");
            }
            order.setClosed();
        }
    }
}
