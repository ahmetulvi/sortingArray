import java.util.Scanner;
import  java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter size of the array: ");
        int size= sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Please enter elements of the array:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[i] ){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array elements: " + Arrays.toString(arr));


    }

}
