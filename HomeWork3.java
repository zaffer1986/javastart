/**
 *Java basic: HomeWork3
 *
 @author Muzaffar Eshonqulov
 @todo 16.9.2022
 @date 12.9.2022
 *
*/
class HomeWork3 {
    public static void main (String[] args) {
        //Level-1
        //task
        int[] arr= {10,20,30,40,50};
        printArray(arr);
        
        //task2
        int max = getMax(arr);
        System.out.println("Max =" + max);
        
        //task3
        int[] invert = {0,1,0,1,0,1,0,1,0,1};
        System.out.println("original:");
        for(int j = 0; j <invert.length; j++) 
            System.out.print(invert[j] + " ");
        System.out.println();
        System.out.println("original from last number:");
        for(int j = invert.length -1; j > 0; j--) 
            System.out.print(invert[j] + " ");
    }
    //Methods Level 1
    //task1
    static void printArray(int[] array) {
        System.out.print("(");
        for (int i = 0; i < array. length; i++) {
            System.out.print(array[i]);
            if (i < array. length -1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
    //task2
    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    //task3
}