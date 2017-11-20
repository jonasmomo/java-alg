package Array;

import java.util.Arrays;

public class alg {
    private int[] myArray = new int[50];
    private int arraySize = 10;

    void generateArray(){

        for (int i = 0; i < arraySize; i++) {
            myArray[i] = (int)(Math.random()*10)+10;
        }
    }

    void testPrintArray() {
        System.out.println(Arrays.toString(myArray));
    }

    void printArray() {
        System.out.println("---------");
        for (int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(myArray[i] + " |");
            System.out.println("---------");
        }
    }
}
