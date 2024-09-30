import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class BubbleSortVisualizer {
        
        public static void sort(List<Integer> array, ControlPanel controlPanel) {
            // Implement Bubble Sort and update visualization
            Timeline timeline = new Timeline();
            int arraySize = array.size();
            int[] step = {0}; // Keep track of the sorting step

            // Outer loop to simulate bubble sort steps
            for (int i = 0; i < arraySize - 1; i++) {
                for (int j = 0; j < arraySize - 1 - i; j++) {
                    // Inner loop with sorting logic and visualization update
                    final int currentJ = j; //final variable inside lambda
                
                    timeline.getKeyFrames().add(new KeyFrame(Duration.millis(1 * step[0]), e -> {
                    if (array.get(currentJ) > array.get(currentJ + 1)) {
                        // Swap elements
                        int temp = array.get(currentJ);
                        array.set(currentJ, array.get(currentJ + 1));
                        array.set(currentJ + 1, temp);
                    }
                    // Redraw the bar chart after each swap or comparison
                    controlPanel.drawBarChart();
                }));
                step[0]++;
                if (step[0] >= array.size()) {
                    timeline.stop(); // Stop the timeline once sorting is complete
                }
            }
        }

        timeline.setCycleCount(step[0]);
        timeline.play(); 
        // Start the sorting animation
            // int temp = 0;
            // for (int i = 0; i < array.size() -1; i++){
            //     for (int j = 0; j < array.size() - 1 - i; j++){
            //         if (array.get(j) > array.get(j+1)){
            //             temp = array.get(j);
            //             array.set(j, array.get(j+1));
            //             array.set(j+1, temp);
            //             controlPanel.drawBarChart();
            //         }
            //     }   
            // }
            
            // return array;
        }
}