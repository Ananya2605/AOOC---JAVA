import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];

        System.out.println("Enter 5 sorted elements for first array:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 5 sorted elements for second array:");
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;

        while (i < 5 && j < 5) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < 5)
            c[k++] = a[i++];

        while (j < 5)
            c[k++] = b[j++];

        System.out.println("Merged sorted array:");
        for (int x = 0; x < 10; x++) {
            System.out.print(c[x] + " ");
        }
        sc.close();
    }
}
