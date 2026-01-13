import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        char[] arr = new char[n];
        boolean flag = true;
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            if(arr[i] > ch){
                System.out.println(arr[i]);
                flag = false;
                break;
            }
            
        }
        if(flag){
            System.out.println(-1);
        }
    }
}
