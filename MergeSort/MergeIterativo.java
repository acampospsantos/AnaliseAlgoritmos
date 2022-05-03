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

    
    //Função MergeSort Iterativa para ordenar Array[0...n-1]
    static void mergeSort(int arr[], int n) {

        // Para o tamanho atual dos subarrays serem mesclados, curr_size varia de 1 a n/2
        int curr_size;

        // Para escolher o índice inicial do subarray esquerdo a ser mesclado
        int left_start;

        // Mescla subarray's de maneira ascendente. Primeiro mescla os subarrays de tamanho 1 para criar subarrays ordenados de tamanho 2 e, em seguida, mescla
        // subarrays de tamanho 2 para criar subarrays classificados de tamanho 4 e assim por diante.
        for (curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {
            // Escolhe o ponto de partida de diferentes subarrays de tamanho atual
            for (left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {
                // Encontra o ponto final do subarranjo esquerdo. mid+1 é o ponto inicial da direita
                int mid = Math.min(left_start + curr_size - 1, n - 1);

                int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

                // Mescla subarrays arr[left_start...mid] e arr[mid+1...right_end
                merge(arr, left_start, mid, right_end);
            }
        }
    }

    
    //Função para mesclar os dois possui arr[l..m] e arr[m+1..r] do array arr[]  
    static void merge(int arr[], int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        //Cria Array Temporário
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copia(passa) os dados para os Arrays temporários L[] e R[]        
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        // Mescla os arrays temporários de volta ao array[l..r]
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

        // Copia os elementos restantes de L[], se tiver algum
        while (i < n1) {
            arr[k] = L[i];
            i=i+1;
            k=k+1;
        }

        // Copia os elementos restantes de R[], se tiver algum
        while (j < n2) {
            arr[k] = R[j];
            j=j+1;
            k=k+1;
        }
    }
}
