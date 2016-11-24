package org.karanki.coding.hacker_rank_algorithms_circular_array_rotation;

import java.util.Scanner;



/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href="https://www.hackerrank.com/challenges/circular-array-rotation">https://www.hackerrank.com/challenges/circular-array-rotation</a>
 *
 */
public class Solution {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();        
        }
        
        
        
        in.close();
    }
}
