package com.vector;

public class TestVectors {
    public static void main(String[] args) {
        // Test ArrayVector
        System.out.println("Testing ArrayVector:");
        ArrayVector av1 = new ArrayVector(new double[]{1, 2, 3});
        ArrayVector av2 = new ArrayVector(new double[]{4, 5, 6});

        System.out.println("av1: " + av1);
        System.out.println("av2: " + av2);
        System.out.println("av1 length: " + av1.length());
        System.out.println("av1 magnitude: " + av1.magnitude());
        System.out.println("Distance between av1 and av2: " + av1.distanceTo(av2));
        System.out.println("av1 + av2: " + av1.plus(av2));
        System.out.println("av1 - av2: " + av1.minus(av2));
        System.out.println("av1 scaled by 2: " + av1.scale(2));
        System.out.println("Dot product of av1 and av2: " + av1.dot(av2));

        av1.append(4);
        System.out.println("av1 after appending 4: " + av1);
        av1.insert(0, 0);
        System.out.println("av1 after inserting 0 at index 0: " + av1);
        av1.remove(2);
        System.out.println("av1 after removing element at index 2: " + av1);

        // Test ListVector
        System.out.println("\nTesting ListVector:");
        ListVector lv1 = new ListVector();
        lv1.append(1);
        lv1.append(2);
        lv1.append(3);
        ListVector lv2 = new ListVector();
        lv2.append(4);
        lv2.append(5);
        lv2.append(6);

        System.out.println("lv1: " + lv1);
        System.out.println("lv2: " + lv2);
        System.out.println("lv1 length: " + lv1.length());
        System.out.println("lv1 magnitude: " + lv1.magnitude());
        System.out.println("Distance between lv1 and lv2: " + lv1.distanceTo(lv2));
        System.out.println("lv1 + lv2: " + lv1.plus(lv2));
        System.out.println("lv1 - lv2: " + lv1.minus(lv2));
        System.out.println("lv1 scaled by 2: " + lv1.scale(2));
        System.out.println("Dot product of lv1 and lv2: " + lv1.dot(lv2));

        lv1.append(4);
        System.out.println("lv1 after appending 4: " + lv1);
        lv1.insert(0, 0);
        System.out.println("lv1 after inserting 0 at index 0: " + lv1);
        lv1.remove(2);
        System.out.println("lv1 after removing element at index 2: " + lv1);
    }
}
