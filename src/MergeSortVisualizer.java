import java.util.ArrayList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class MergeSortVisualizer {
    static void sort(List<Integer> array, ControlPanel controlPanel) {
        // Implement Insertion Sort and update visualization
        int length = array.size();
        if (length <= 1) return; //base case

        int middle = length/2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for (int i = 0; i < middle; i++){
            leftArray.set(i, array.get(i));
        }
        for (int i = length-middle-1; i < length; i++){
            rightArray.set(i, array.get(i));
        }
        sort(leftArray, controlPanel);
        sort(rightArray, controlPanel);
        merge(leftArray, rightArray, array);
    }
    private static void merge(List<Integer> leftArray, List<Integer> rightArray, List<Integer> array){
        int leftSize = array.size()/2;
        int rightSize = array.size() - leftSize;
        int i = 0;
        int l = 0; 
        int r = 0;

    }

}