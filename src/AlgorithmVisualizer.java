import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlgorithmVisualizer extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 600, Color.DARKBLUE);
        Image icon = new Image("VisualizerIcon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Algorithm Visualizer");
        primaryStage.setWidth(1400);
        primaryStage.setHeight(900);
        primaryStage.setX(50);
        primaryStage.setY(50);
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
        // launch(args);
        Application.launch(args);
        int [] arrayi = {4,3,5,6,1,7};
        // BubbleSortVisualizer array = new BubbleSortVisualizer(arrayi);
        // int [] abc = array.getSortedArray(arrayi);
        // for (int i : abc){
        //     System.out.print(i + " ");
        // }
        
    }
}