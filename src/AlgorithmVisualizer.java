import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AlgorithmVisualizer extends Application {
    @Override
    public void start(Stage primaryStage) {
        // BorderPane root = new BorderPane();
        // // Setup your visualization components here
        // Scene scene = new Scene(root, 800, 600);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("Algorithm Visualizer");
        // primaryStage.show();
    }

    public static void main(String[] args) {
        // launch(args);
        int [] arrayi = {4,3,5,6,1,7};
        BubbleSortVisualizer array = new BubbleSortVisualizer(arrayi);
        int [] abc = array.getSortedArray(arrayi);
        for (int i : abc){
            System.out.print(i + " ");
        }
        
    }
}