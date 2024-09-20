public class BubbleSortVisualizer {
    private int[] array;
    // Constructor, getters, and setters
    public BubbleSortVisualizer(int array[]){
        this.array = array;
    }
    public int [] getSortedArray(int array[]){
        sort(array);
        return array;
    }

    private int[] sort(int [] array) {
        // Implement Bubble Sort and update visualization

        int temp = 0;
        for (int i = 0; i < array.length -1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }   
        }
        return array;
    }

    private void updateVisualization() {
        // Code to update the visual representation
    }
}