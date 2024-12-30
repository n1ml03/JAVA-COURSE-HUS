package com.sortstrategy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10, 21);
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = random.nextInt(0, n * 2);
        }

        SortStrategy sortStrategy = SortStrategy.getInstance();
        StringBuilder result = new StringBuilder();

        String[] sortAlgorithms = {"Bubble Sort", "Selection Sort", "Insertion Sort"};
        ISort[] sorters = {new BubbleSort(), new SelectionSort(), new InsertionSort()};

        for (int i = 0; i < 3; i++) {
            sortStrategy.setSortee(sorters[i]);
            int[] arr = original.clone();
            result.append("Using ").append(sortAlgorithms[i]).append(" Algorithm:\nBefore sorting: ").append(Arrays.toString(arr)).append("\nAfter sorting: ");
            int numberOfSwaps = sortStrategy.sort(arr);
            result.append(Arrays.toString(arr)).append("\nNumber of swaps: ").append(numberOfSwaps).append("\n\n");
        }

        System.out.println(result.toString());

        try (FileWriter fileWriter = new FileWriter("SortStrategy21002158.txt")) {
            fileWriter.write(result.toString());
        } catch (IOException e) {
            System.out.println("Can't write to file!");
            e.printStackTrace();
        }
    }
}
