public class InsertionSortVisualizer {
    private int[] array;
    // Constructor, getters, and setters
    public InsertionSortVisualizer(int array[]){
        this.array = array;
    }
    public int [] getSortedArray(int array[]){
        sort(array);
        return array;
    }

    private int[] sort(int [] array) {
        // Implement Insertion Sort and update visualization
        for (int i = 1; i < array.length -1; i++){
            int temp = array[i];
            int j = i - 1;

            while (j>0 && array[j] > temp){
                array [j+1] = array[j];
                j--;
            }

        }
        return array;
    }

    private void updateVisualization() {
        // Code to update the visual representation
    }
}