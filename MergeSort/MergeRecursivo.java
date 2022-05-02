package MergeSort;

public class MergeRecursivo {

    public static void main (String[] args){
        int[] vetor = {4, 6, 10, 2, 5, 3 };

		int n = vetor.length; //Essa variável "n" recebe o tamanho do vetor = 6

        printArray(vetor, n); //print do Array no início(desordenado)
        sort(vetor, 0, n - 1); // --> mergeSort
        //mergeSort(vetor);
        printArray(vetor, n); //print do Array após o MergeSort (Ordenado)
    }

    // Função para Imprimir valores do Array
	public static void printArray(int v[], int size) {
		System.out.print("Print do Array: ");
		for (int i = 0; i < size; i=i+1) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}


    
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void mergeSort(int[] v, int left, int middle, int right) {
		System.out.println("- MergeSort -");
         // Find sizes of two subarrays to be merged
		int n1 = middle - left + 1;
		int n2 = right - middle;

        //Create temp arrays 
		int L[] = new int[n1];
		int R[] = new int[n2];

        //Copy data to temp arrays
		for (int i = 0; i < n1; ++i) {
			L[i] = v[left + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = v[middle + 1 + j];
		}

        //Merge the temp arrays

        // Initial indexes of first and second subarrays
		int i = 0, j = 0;

        // Initial index of merged subarray array
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				v[k] = L[i];
				i = i + 1;
			} else {
				v[k] = R[j];
				j = j + 1;
			}
			k = k + 1;
		}

        //Copy remaining elements of L[] if any        
		while (i < n1) {
			v[k] = L[i];
			i = i + 1;
			k = k + 1;
		}

        //Copy remaining elements of R[] if any
		while (j < n2) {
			v[k] = R[j];
			j = j + 1;
			k = k + 1;
		}
	}


    // Main function that sorts arr[l..r] using merge()
	public static void sort(int arr[], int l, int r) { //l == índice do primeiro elemento do Array, r == índice do último elemento do Array
		
		if (l < r) { //Nessa condição: Encontra o ponto médio para dividir a matriz em duas metades:  
            // Find the middle point
			int meio = l + (r - l) / 2; // == int meio = r / 2  ===> Significa: Pegar o índice do último elemento do vetor e dividir por 2 -> Acharemos o índice do elemento que fico na metade do vetor
			
            // Sort first and second halves
			sort(arr, l, meio); //Chama mergeSort para a primeira metade
			sort(arr, meio + 1, r); //Chama mergeSort para a segunda metade

            // Merge the sorted halves
			mergeSort(arr, l, meio, r); //Mescla as duas metades
		
		} else{ // (l == r) --> Nesse caso, o vetor só tem um elemento, ou seja, não tem oq ordenar
			System.out.println("Partição feita!");
		}
	}
    

    /* EXPLICAÇÕES:
    Complexidade de tempo: Ordenando arrays em diferentes máquinas. Merge Sort é um algoritmo recursivo e a complexidade de tempo pode ser expressa como 
    a seguinte relação de recorrência. 
    T(n) = 2T(n/2) + θ(n)

    A recorrência acima pode ser resolvida usando o método Recurrence Tree ou o método Master. Ela cai no caso II do Método Mestre e a solução da recorrência é θ(nLogn).
    A complexidade de tempo do Merge Sort é θ(nLogn) em todos os 3 casos (pior, médio e melhor), pois o merge sort sempre divide o array em duas metades e leva um tempo
    linear para mesclar duas metades.

    Espaço Auxiliar: O(n)
    Paradigma Algorítmico: Dividir e Conquistar
    Ordenação Local: Não em uma implementação típica
    Estável: Sim
    */



    //2º Forma de Implementação
    /*
    public static void mergeSort(int[] array)   {
        if(array == null) {
            return;
        } 

        if(array.length > 1) {
            int mid = array.length / 2;
 
            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i=i+1) {
                left[i] = array[i];
            }
             
            // Split right part
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i=i+1) {
                right[i - mid] = array[i];
            }
            mergeSort(left);
            mergeSort(right);
 
            int i = 0;
            int j = 0;
            int k = 0;
 
            // Merge left and right arrays
            while(i < left.length && j < right.length) {
                if(left[i] < right[j]) {
                    array[k] = left[i];
                    i=i+1;
                }
                else {
                    array[k] = right[j];
                    j=j+1;
                }
                k=k+1;
            }

            // Collect remaining elements
            while(i < left.length) {
                array[k] = left[i];
                i=i+1;
                k=k+1;
            }
            while(j < right.length) {
                array[k] = right[j];
                j=j+1;
                k=k+1;
            }
        }
    }
    */
    


}
