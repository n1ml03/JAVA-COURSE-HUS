package com.factorymethod.demoprogram;

public class FruitFactory {
    Fruit provideFruit(String type) throws Exception {
        switch (type) {
            case "apple" -> new Apple();
            case "orange" -> new Orange();
            case "banana" -> new Banana();
        }
        throw new Exception("No matching fruit could be provided");
    }
}
