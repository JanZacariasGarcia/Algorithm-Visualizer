import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
import javafx.stage.Stage;

public class ControlPanel{
    @FXML
    private Button logout;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private static BorderPane BorderPane;
    
    Stage stage;

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
    
    public static void BarChart (int[] array){
       
        
    }
    
    public void small(ActionEvent e){
        AlgorithmVisualizer.len = 50;
    }
    public void medium(ActionEvent e){
        AlgorithmVisualizer.len = 100;
    }
    public void large (ActionEvent e){
        AlgorithmVisualizer.len = 150;
    }
    public void bb (ActionEvent e){
        
    }
    public void ins (ActionEvent e){

    }
    public void mer (ActionEvent e){

    }
    public void startSort (ActionEvent e){

    }
}