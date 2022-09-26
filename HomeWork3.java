
/**
 *Java basic: HomeWork3
 *
 @author Muzaffar Eshonqulov
 @todo 12.09.2022
 @date 27.09.2022
 *Please check line from 70 to 120
 *
*/
class HomeWork3 {
    public static void main (String[] args) {
        //Level-1
        //task
        /*int[] arr= {10,20,30,40,50};
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
        
        int[] invArray={0, 1, 1, 0, 0, 0, 1, 1};
        printArray(invArray);
        printArray(invertArray(invArray));
        

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
    static int[] invertArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            result[i]=1-array[i];
        }
        return result;
        */
        // Level 2
        // task1
        int[] array={5, 6, 8, 55, 66, 85, 3, -1, -5, 6};
        System.out.print("Array length before sorting:\n");
        for(int i=0; i< array.length; i++){
        System.out.println(array[i]);
        }
        sortArray(array, array.length);
        System.out.print("Array length after sorting:\n");
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
        //task2
        int[] sortedArray = bubleSort(array, true);
        System.out.println(sortedArray);
        System.out.println(bubleSort(array,false));
        
        
    }
    //Level 2
    //task1
    static int[] sortArray(int[] array, int n) {
        int[] result = new int[array.length];
        for(int i=1; i < n; i++){
            int j =i;
            int a =array[i];
        
            while ((j > 0) && (array[j-1]>a)) {
                array[j] = array[j-1];
                j--;
            }
            array[j]=a;
            result[j] = array[j];
        }
        return result;
    }
    //task2
    static int[] bubleSort(int[] array, boolean asc) {
        int[] result = new int[array.length];
        System.arraycopy(array,0,result,0,array.length);
        for (int i =result.length-1; i>0; i--) {
            for (int j=0; j<i; j++){
                if ((result[j]>result[j+1] && asc)
                || (result[j]< result[j+1] && !asc)) {
                int tmp = result[j];
                result[j]=result[j+1];
                result[j+1]=tmp;
                }
            }
        }
        return result;
    }
}