package org.example;

import java.util.Arrays;
import java.util.concurrent.*;

public class QuickSort {

    public static void main(String[] args) {
        int[] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        int[] sortedArray = parallelQuicksort(unsortedArray, executorService);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        executorService.shutdown();
    }

    public static int[] parallelQuicksort(int[] arr, ExecutorService executorService) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[arr.length / 2];
        int[] left = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] right = Arrays.stream(arr).filter(x -> x > pivot).toArray();
        int[] equal = Arrays.stream(arr).filter(x -> x == pivot).toArray();

        Future<int[]> futureLeft = executorService.submit(() -> parallelQuicksort(left, executorService));
        Future<int[]> futureRight = executorService.submit(() -> parallelQuicksort(right, executorService));

        try {
            return concatenate(futureLeft.get(), equal, futureRight.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return arr;
        }
    }

    private static int[] concatenate(int[] left, int[] equal, int[] right) {
        int[] result = new int[left.length + equal.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(equal, 0, result, left.length, equal.length);
        System.arraycopy(right, 0, result, left.length + equal.length, right.length);
        return result;
    }
}
