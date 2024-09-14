import  java.util.*;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={56,88,44,6};
        int temp;
        int l=arr.length;
        System.out.println(l);
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1;j++){
                if(arr[j]>arr[j+1]){

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int i=0;i<l-1;i++){
            System.out.print(arr[i]+" ");;
        }
    }
}
