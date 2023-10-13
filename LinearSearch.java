import java.util.Scanner;

public class LinearSearch
{
    public static int linearSearch(int[] arr, int key) 
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key) 
            {
                return i;
            }
        }
        return -1; 
}

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the key value to search: ");
        int key = scanner.nextInt();
        int result = linearSearch(arr, key);
        if (result == -1)
        {
            System.out.println("Element not present in the array");
        }
        else 
        {
            System.out.println("Element found at index: " + result);
        }
        scanner.close();
    }
}
