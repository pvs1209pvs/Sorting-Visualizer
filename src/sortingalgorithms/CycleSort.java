
package sortingalgorithms;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import visuals.Bar;

import java.util.List;

public class CycleSort implements Sorter {
//    public void sort(T[] array) {
//
//        T item = null; //to hold the items that are being worked on
//        int cyclestart = 0;
//        int pos = 0; //to find the correct pos where to place the items
//
//        for (int i = 0; i < array.length; i++) {
//            item = array[i];
//            cyclestart = i;
//            pos = cyclestart;
//
//            for (int j = (cyclestart + 1); j < array.length; j++) {
//                if (array[j].compareTo(item) < 0) {
//                    pos++;
//                }
//            }
//
//            if (pos == cyclestart) {
//                continue;
//            }
//
//            while (array[pos] == item) {
//                pos++;
//            }
//
//            //Swap
//            T temp = item;
//            item = array[pos];
//            array[pos] = temp;
//
//            while (pos != cyclestart) {
//                pos = cyclestart;
//
//                for (int j = (cyclestart + 1); j < array.length; j++) {
//                    if (array[j].compareTo(item) < 0) {
//                        pos++;
//                    }
//                }
//
//                while (array[pos] == item) {
//                    pos++;
//                }
//
//                //swap
//                temp = item;
//                item = array[pos];
//                array[pos] = temp;
//            }
//        }
//    }

    @Override
    public void sort(Bar[] bars, List<Animation> trans, int gap, double seconds) {
        // INCOMPLETE
    }
}
