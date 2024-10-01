import java.util.ArrayList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class MergeSortVisualizer {
    public static void sort(List<Integer> array, ControlPanel controlPanel) {
        int length = array.size();
        if (length <= 1) return; // Base case for recursion

        // Divide the array into two halves
        int middle = length / 2;
        List<Integer> leftArray = new ArrayList<>(array.subList(0, middle)); // Use subList for splitting
        List<Integer> rightArray = new ArrayList<>(array.subList(middle, length));

        // Recursively sort both halves
        sort(leftArray, controlPanel);
        sort(rightArray, controlPanel);

        // Merge the sorted halves and visualize the process
        merge(leftArray, rightArray, array, controlPanel);
    }

    private static void merge(List<Integer> leftArray, List<Integer> rightArray, List<Integer> array, ControlPanel controlPanel) {
        int leftSize = leftArray.size();
        int rightSize = rightArray.size();
        
        // Use arrays to make l, r, and i mutable inside the lambda
        final int[] i = {0};
        final int[] l = {0};
        final int[] r = {0};
    
        Timeline timeline = new Timeline();
        final int totalSize = leftSize + rightSize;
    
        KeyFrame keyFrame = new KeyFrame(Duration.millis(10), e -> {
            if (l[0] < leftSize && r[0] < rightSize) {
                if (leftArray.get(l[0]) <= rightArray.get(r[0])) {
                    array.set(i[0], leftArray.get(l[0]));
                    l[0]++;
                } else {
                    array.set(i[0], rightArray.get(r[0]));
                    r[0]++;
                }
                i[0]++;
            } else if (l[0] < leftSize) {
                array.set(i[0], leftArray.get(l[0]));
                l[0]++;
                i[0]++;
            } else if (r[0] < rightSize) {
                array.set(i[0], rightArray.get(r[0]));
                r[0]++;
                i[0]++;
            }
    
            // Redraw the bar chart after each merge step
            controlPanel.drawBarChart(Color.WHITE);
    
            // If the merge is done, stop the timeline and set the chart color to green
            if (i[0] >= totalSize) {
                timeline.stop();
                controlPanel.drawBarChart(Color.GREEN); // Turn green after the merge is complete
            }
        });
    
        // Set the KeyFrame to the timeline and play
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(totalSize); // Set cycle count for merge steps
        timeline.play();
    }
}