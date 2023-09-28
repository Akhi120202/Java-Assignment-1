public class Sorting {
   
        public static void main(String[] args) {
            String soliloquy = "To be or not to be, that is the question; "
                + "Whether `tis nobler in the mind to suffer "
                + "the slings and arrows of outrageous fortune, "
                + "or to take arms against a sea of troubles, "
                + "and by opposing end them?";
    
            // Split the soliloquy into words
            String[] words = soliloquy.split("[\\s,;.`]+");
    
            // Sort the words using the bubble sort algorithm
            bubbleSort(words);
    
            // Display the sorted words
            for (String word : words) {
                System.out.println(word);
            }
        }
    
        // Bubble sort algorithm for sorting an array of words
        private static void bubbleSort(String[] array) {
            int n = array.length;
            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i < n - 1; i++) {
                    if (array[i].compareTo(array[i + 1]) > 0) {
                        
                        // Swap the words if they are out of order
                        String temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);
        }

    
    
}
