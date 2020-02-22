import java.util.*;
import java.io.*;
public class KickStart {
    public static void main (String[] args) throws FileNotFoundException{
        int T = 3; //number of test cases
        int N = 4; //students to pick from
        int P = 3; //students needed for the team
        int S[] = new int[]{1, 3, 9, 100}; //scores of the students
        int sum = 0;
        int arr[] = new int[N-P+1];
        System.out.println(Arrays.toString(S));
        
        for(int i = 0; i>arr.length; i++){
            for(int j = N-1; j>N-P; j--){
              S[j] - S[j-1] = sum; 
              sum=+sum;
            }
           arr[i]=sum;   
        }
        System.out.println(Arrays.toString(arr));
    }
}