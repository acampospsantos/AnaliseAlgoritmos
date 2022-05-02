package MergeSort;

public class MergeIterativo {

    public static void main(String[] args) {
        int[] vetor = { 4, 6, 10, 2, 5, 3 };

        int n = vetor.length; // Essa variável "n" recebe o tamanho do vetor = 6

        printArray(vetor, n); // print do Array no início(desordenado)
        mergeSort(vetor, n); // --> mergeSort
        printArray(vetor, n); // print do Array após o MergeSort (Ordenado)
    }

    // Função para Imprimir valores do Array
    public static void printArray(int v[], int size) {
        System.out.print("Print do Array: ");
        for (int i = 0; i < size; i=i+1) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    
    //Iterative mergesort function to sort arr[0...n-1]
    static void mergeSort(int arr[], int n) {

        // For current size of subarrays to be merged curr_size varies from 1 to n/2
        int curr_size;

        // For picking starting index of left subarray to be merged
        int left_start;

        // Merge subarrays in bottom up manner. First merge subarrays of size 1 to create sorted subarrays of size 2, then merge
        // subarrays of size 2 to create sorted subarrays of size 4, and so on.
        for (curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {
            // Pick starting point of different subarrays of current size
            for (left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {
                // Find ending point of left subarray. mid+1 is starting point of right
                int mid = Math.min(left_start + curr_size - 1, n - 1);

                int right_end = Math.min(left_start
                        + 2 * curr_size - 1, n - 1);

                // Merge Subarrays arr[left_start...mid] & arr[mid+1...right_end]
                merge(arr, left_start, mid, right_end);
            }
        }
    }

    
    //Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[]    
    static void merge(int arr[], int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        /* create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays L[]and R[]        
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays back into arr[l..r]
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i=i+1;
            } else {
                arr[k] = R[j];
                j=j+1;
            }
            k=k+1;
        }

        //Copy the remaining elements of L[], if there are any
        while (i < n1) {
            arr[k] = L[i];
            i=i+1;
            k=k+1;
        }

        // Copy the remaining elements of R[], if there are any
        while (j < n2) {
            arr[k] = R[j];
            j=j+1;
            k=k+1;
        }
    }
}
