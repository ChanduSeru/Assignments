package basic;
public class Assignment2 {
    
   
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException();
        }
        
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
 
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " , ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
  
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer Array:");
        printArray(intArray);
        
        swap(intArray, 1, 3);
        System.out.println("After swapping elements at index 1 and 3:");
        printArray(intArray);
        
     
        String[] strArray = {"apple", "orange", "banana", "grape"};
        System.out.println("\nOriginal String Array:");
        printArray(strArray);
        
        swap(strArray, 0, 2);
        System.out.println("After swapping elements at index 0 and 2:");
        printArray(strArray);
        
      
        Double[] doubleArray = {3.14, 2.71, 1.618};
        System.out.println("\nOriginal Double Array:");
        printArray(doubleArray);
        
        swap(doubleArray, 0, 2);
        System.out.println("After swapping elements at index 0 and 2:");
        printArray(doubleArray);
    }
}
