<<<<<<< HEAD
import sortingalgorithms.*;
=======
import sortingalgorithms.ComparativeSorter;
import sortingalgorithms.InsertionSort;
import sortingalgorithms.ShellSort;
>>>>>>> 11e07975f6247af3a80a5654c0874ab1ddcb5a4f

import java.util.Random;

public class Main {

    private Main() {

        for (int i = 0; i < 1; i++) {

            Random randomGen = new Random(i);

            int[] array = new int[Math.abs(randomGen.nextInt()) % 100 + 1];

            Integer[] arr = new Integer[array.length];

            for (int j = 0; j < array.length; j++) {
                array[j] = Math.abs(randomGen.nextInt() % 10 + 1);
            }

            for (int j = 0; j < arr.length; j++) {
                arr[j] = array[j];
            }


<<<<<<< HEAD
            ComparativeSorter<Integer> s = new SelectionSort<>();
=======
            ComparativeSorter<Integer> s = new ShellSort<>();
>>>>>>> 11e07975f6247af3a80a5654c0874ab1ddcb5a4f
            s.sort(arr);



            if (!isSorted(arr)) {
                System.out.println("Fails at seed " + i);
            }
        }
    }

    private boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > (array[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Main();
    }
}
