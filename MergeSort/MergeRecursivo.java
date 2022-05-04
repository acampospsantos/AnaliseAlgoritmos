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


    
    // Função principal que ordena o Array[l...r] justamente fazendo a mesclagem(merge)
	public static void sort(int arr[], int l, int r) { //l == índice do primeiro elemento do Array, r == índice do último elemento do Array
		
		if (l < r) { //Nessa condição: Encontra o ponto médio para dividir o Array em duas metades:  
            // Encontra o elemento do meio(central)
			int meio = l + (r - l) / 2; 
			
            // Ordena a primeira e a segunda metade
			sort(arr, l, meio); //Chama mergeSort para a primeira metade
			sort(arr, meio + 1, r); //Chama mergeSort para a segunda metade

            // Mescla as metades ordenadas 
			mergeSort(arr, l, meio, r); //Mescla as duas metades
		
		} else{ // (l == r) --> Nesse caso, o vetor só tem um elemento, ou seja, não tem oq ordenar
			System.out.println("Partição feita!");
		}
	}



    // Mescla dois subarry's do Array Original[]
    // Primeiro subArray é arr[l..m]
    // Segundo SubArray é arr[m+1..r]
    public static void mergeSort(int[] vetor, int left, int middle, int right) {
		System.out.println("- MergeSort -");
        
        //Encontra os tamanhos dos dois subarray's a serem mesclados
		int n1 = middle - left + 1;
		int n2 = right - middle;

        //Cria Array's temporários
		int L[] = new int[n1];
		int R[] = new int[n2];

        //Copia(passa/preenche) os dados para os Arrays temporários
		for (int i = 0; i < n1; i=i+1) {
			L[i] = vetor[left + i];
		}
		for (int j = 0; j < n2; j=j+1) {
			R[j] = vetor[middle + 1 + j];
		}

        //Mescla os Arrays temporários

        //Índices iniciais do primeiro e segundo subarray's 
		int i = 0, j = 0;

        //Índice inicial do SubArray do Array mesclado
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				vetor[k] = L[i];
				i = i + 1;
			} else {
				vetor[k] = R[j];
				j = j + 1;
			}
			k = k + 1;
		}

        //Copia os elementos restantes de L[] se houver   
		while (i < n1) {
			vetor[k] = L[i];
			i = i + 1;
			k = k + 1;
		}

        //Copia os elementos restantes de R[] se houver
		while (j < n2) {
			vetor[k] = R[j];
			j = j + 1;
			k = k + 1;
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
 
            // Divide parte da esquerda
            int[] left = new int[mid];
            for(int i = 0; i < mid; i=i+1) {
                left[i] = array[i];
            }
             
            // Divide parte da direita 
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i=i+1) {
                right[i - mid] = array[i];
            }
            mergeSort(left);
            mergeSort(right);
 
            int i = 0;
            int j = 0;
            int k = 0;
 
            // Mescla Array da esquerda e da direita
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

            // Coleta os elementos restantes
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
