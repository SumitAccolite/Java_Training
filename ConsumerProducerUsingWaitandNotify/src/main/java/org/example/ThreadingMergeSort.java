package org.example;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadingMergeSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7 , 4, 12, 982 , 0};

        System.out.println("Original array: " + Arrays.toString(array)+"\n");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<int[]> result = executorService.submit(new MergeSortCallable(array));

        try {
            int[] sortedArray = result.get();
            System.out.println("Sorted array: " + Arrays.toString(sortedArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}

class MergeSortCallable implements Callable<int[]> {
    private final int[] array;

    public MergeSortCallable(int[] array) {
        this.array = array;
    }

    @Override
    public int[] call() throws Exception {
        return mergeSort(array);
    }

    private int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<int[]> leftResult = executorService.submit(new MergeSortCallable(left));
        Future<int[]> rightResult = executorService.submit(new MergeSortCallable(right));

        try {
            int[] leftArray = leftResult.get();
            int[] rightArray = rightResult.get();
            return merge(leftArray, rightArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();

        return null;
    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                merged[mergedIndex++] = left[leftIndex++];
            } else {
                merged[mergedIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            merged[mergedIndex++] = left[leftIndex++];
        }
       while(rightIndex<right.length){
           merged[mergedIndex++]=right[rightIndex++];
       }
        return merged;
    }

}
