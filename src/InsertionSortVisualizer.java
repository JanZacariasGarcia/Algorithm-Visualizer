import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class InsertionSortVisualizer {
    static void sort(List<Integer> array, ControlPanel controlPanel) {
        // Timeline to handle each sorting step
        Timeline timeline = new Timeline();

        // Variables to track the outer and inner loop progress
        final int[] i = {1}; // Start at index 1 as per insertion sort
        final int[] j = {0}; // To track inner loop

        // Temp variable to store the element being inserted
        final int[] temp = {array.get(i[0])};

        KeyFrame keyFrame = new KeyFrame(Duration.millis(1), e -> {
            // Inner loop logic: shifting elements
            if (j[0] >= 0 && array.get(j[0]) > temp[0]) {
                // Shift element one position to the right
                array.set(j[0] + 1, array.get(j[0]));
                j[0]--; // Move to the previous element
            } else {
                // Insert the temp value in its correct position
                array.set(j[0] + 1, temp[0]);
                // Move to the next element in the outer loop
                i[0]++;
                // Check if sorting is complete
                if (i[0] >= array.size()) {
                    timeline.stop(); // Stop the timeline once sorting is complete
                } else {
                    // Reset the temp value and j for the next iteration of outer loop
                    temp[0] = array.get(i[0]);
                    j[0] = i[0] - 1;
                }
            }
            // Redraw the bar chart for visualization
            controlPanel.drawBarChart();
        });

        // Set the timeline to indefinitely repeat the steps until sorting is complete
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play(); // Start the animation
    }
}