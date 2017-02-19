import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Solution s = new Solution();
        // If we have an array of size 5, and perform 5 rotations, then we get the origional array. Optimization:
        int rotations = k%n;
        s.rotateLeft(a, n, rotations);
        s.printArray(a, n);
    }
    
    // Print Array Values to stdout
    void printArray(int[] array, int size) {
        
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    
    // Rotate the values in the array to the left d times
    void rotateLeft(int[] array, int size, int times) {
        
        if (times != 0) {
            
            int temp = array[0];
            for (int i = 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            array[size - 1] = temp;
            
            rotateLeft(array, size, times - 1);
        }
    }
}
