import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class BubbleSortVisualizer {
        public static void sort(List<Integer> array, ControlPanel controlPanel) {
        // Create a new Timeline for sorting animation
        int arraySize = array.size();
        final int[] i = {0}; // Track outer loop index
        final int[] j = {0}; // Track inner loop index
        Timeline timeline = new Timeline();

        KeyFrame keyFrame = new KeyFrame(Duration.millis(10), e -> {
            // If outer loop is complete, stop the timeline
            if (i[0] >= arraySize - 2) {
                timeline.stop(); // Stop the timeline after sorting is complete
                controlPanel.drawBarChart(Color.GREEN); // Draw the chart in green after sorting
                return;
            }
            if (i[0] >= arraySize - 1) {
                timeline.stop(); // Stop the timeline after sorting is complete
                return;
            }

            // Inner loop of bubble sort: Swap if the current element is greater than the next
            if (j[0] < arraySize - 1 - i[0]) {
                if (array.get(j[0]) > array.get(j[0] + 1)) {
                    // Swap the elements
                    int temp = array.get(j[0]);
                    array.set(j[0], array.get(j[0] + 1));
                    array.set(j[0] + 1, temp);
                }
                // Move to the next comparison in the inner loop
                j[0]++;
            } else {
                // If inner loop (j) is complete, move to the next iteration of the outer loop (i)
                j[0] = 0; // Reset j for the next iteration
                i[0]++;   // Move to the next outer loop iteration
            }

            // Redraw the bar chart after each swap
            controlPanel.drawBarChart(Color.WHITE);
        });

        // Add the keyframe to the timeline and set the cycle count to indefinite
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        return;
        }
}