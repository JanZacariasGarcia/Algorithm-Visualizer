public class MergeSortVisualizer {
    private int[] array;
    // Constructor, getters, and setters
    public MergeSortVisualizer(int array[]){
        this.array = array;
    }
    public int [] getSortedArray(int array[]){
        sort(array);
        return array;
    }

    private void sort(int [] array) {
        // Implement Insertion Sort and update visualization
        int length = array.length;
        if (length <= 1) return; //base case

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for (int i = 0; i < middle; i++){
            leftArray[i] = array [i];
        }
        for (int i = length-middle-1; i < length; i++){
            rightArray[i] = array[i];
        }
        sort(leftArray);
        sort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0;
        int l = 0; 
        int r = 0;

    }

    private void updateVisualization() {
        // Code to update the visual representation
    }
}