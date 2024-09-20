package Arrays;

import java.util.Arrays;

public class RotateArray {
    static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    
       public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        k=k%n;
        System.out.println(Arrays.toString(arr));
        //right rotation
        reverse(arr,0,n-1); //0 t0 6 [7 6 5 4 3 2 1]
        reverse(arr,0,k-1); //0 t0 2 [5 6 7 4 3 2 1]
        reverse(arr, k, n-1); //3 to 6 [5 6 7 1 2 3 4]
        System.out.println(Arrays.toString(arr));

        //left rotation
        reverse(arr, 0,k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
