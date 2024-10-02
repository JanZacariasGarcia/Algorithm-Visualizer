import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlgorithmVisualizer extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
        Scene scene = new Scene(root);
        Image icon = new Image("GraphVisualizerIcon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Algorithm Visualizer");
        // primaryStage.setWidth(1400);
        // primaryStage.setHeight(900);
        // primaryStage.setX(50);
        // primaryStage.setY(50);
        // Text text = new Text();
        // text.setText("Small");
        // text.setX(50);
        // text.setY(50);
        // text.setFont(Font.font("Verdana", 50));
        // text.setFill(Color.LIMEGREEN);
        // root.getChildren().add(text);
        // primaryStage.setFullScreen(true);
        // primaryStage.setFullScreenExitHint("");
        // primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("I"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}