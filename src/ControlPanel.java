import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControlPanel{
    @FXML
    private Button logout;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private BorderPane BorderPane;
    
    Stage stage;

    public static List<Integer> array = new ArrayList<>(); // Store the bar heights
        public int length = 50;
    
        // Initialize method
        @FXML
        public void initialize() {
            // Initial data for the chart
            Random rand = new Random();
            //populate array with corresponding size
            for (int i = 0; i < 50; i++){
                 array.add(rand.nextInt(99)+1);
            }
            // Draw the initial chart on top of the FXML components
            drawBarChart();
        }
    
        // Function to draw the bar chart
        public void drawBarChart() {
            int chartWidth = 1000; // Total width of the chart area
            int chartHeight = 300; // Total height of the chart area
            int barWidth = chartWidth / array.size(); // Width of each bar
            int max = findMax(array); // Get the maximum value from the array
        
                // Clear the pane before redrawing (important for updating)
                scenePane.getChildren().removeIf(node -> node instanceof Rectangle || node instanceof Text);
        
                for (int i = 0; i < array.size(); i++) {
                    // Calculate the height of each bar relative to the maximum value
                    int barHeight = (int) ((array.get(i) / (double) max) * chartHeight);
        
                    // Create a rectangle for the bar
                    Rectangle bar = new Rectangle();
                    bar.setX(i * barWidth + 80); // Position the bar horizontally
                    bar.setY(chartHeight - barHeight + 150); // Position the bar vertically
                    bar.setWidth(barWidth - 2); // Set the width of the bar
                    bar.setHeight(barHeight); // Set the height of the bar
                    bar.setFill(Color.WHITE); // Set the color of the bar
        
                    // Add the bar to the scenePane (AnchorPane from FXML)
                    scenePane.getChildren().add(bar);
        
                    // Add text labels below the bars
                    // Text label = new Text(i * barWidth + 80, chartHeight + 180, String.valueOf(array.get(i)));
                    // label.setFill(Color.WHITE);
                    // scenePane.getChildren().add(label);
                }
            }
        
            // Helper function to find the maximum value in the array
            public int findMax(List<Integer> array) {
                int max = array.get(0);
                for (int value : array) {
                    if (value > max) {
                        max = value;
                    }
            }
            return max;
        }

    public void logout (ActionEvent event){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("You are about to quit the program.");
        alert.setContentText("Are you sure you would like to quit?");

        if(alert.showAndWait().get() == ButtonType.OK){
        stage = (Stage) scenePane.getScene().getWindow();
        System.out.println("You successfully logged out");
        stage.close();
        }
    }
    
    public void small(ActionEvent e){
        length = 50;
        updateBarChart();
    }
    public void medium(ActionEvent e){
        length = 100;
        updateBarChart();
    }
    public void large (ActionEvent e){
        length = 200;
        updateBarChart();
    }
    public void bb (ActionEvent e){
        BubbleSortVisualizer.sort(array, this);
    }
    public void ins (ActionEvent e){
        InsertionSortVisualizer.sort(array,this);
    }
    public void mer (ActionEvent e){

    }
    public void startSort (ActionEvent e){

    }
    public void updateBarChart(){
        array.clear();
        Random rand = new Random();
        //populate array with corresponding size
        for (int i = 0; i < length; i++){
             array.add(rand.nextInt(99)+1);
        }

        drawBarChart();

    }
}