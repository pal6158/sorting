public class selectionSort {
    public static void main(String brgs[]) {
        int array[] = { 7, 8, 3, 1, 2 };
        // selection Sort

        int min;
        for (int i = 0; i < array.length-1; i++) {
                 min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
        }
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+" ");
       }
    }
}
