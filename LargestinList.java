import java.util.Scanner;

public class LargestinList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();

    System.out.println("Enter the numbers: ");
    int[] numbers = new int[n];
    for(i = 1; i<n; i++) {
      numbers[i] = sc.nextInt();
    }

    int largestNumber = numbers[0];
    for(i = 1; i<n; i++) {
      if(numbers[i] > largestNumber) {
        largestNumber = numbers[i]
          }
    }

  System.out.println{"The largest number in the list is: " + largestNumber);
  Scanner.close();
                    }
  }
}
