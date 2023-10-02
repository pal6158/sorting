
public class BubbleSort {
     
    
    public static void main(String args[]){
        int array[] = { 7, 8, 3, 1, 2 };
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }

            }
        }
  for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }        
    }

    
}    