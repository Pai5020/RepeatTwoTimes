import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int[] arr = new int[6];
        System.out.println("Enter the elements ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Twice : ");
        for (i = 0; i < arr.length ; i++) {
          int count = 0;
            for(j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
                if (count == 1) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
