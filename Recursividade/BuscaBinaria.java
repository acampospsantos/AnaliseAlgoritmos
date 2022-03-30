package Recursividade;

public class BuscaBinaria { //Busca a posição que o elemento desejado está no Array (Recursivamente)
	
	int buscaBinaria(int[] vetorA, int esquerda, int direita, int x) { //vetorA -> Array, x -> Elemento procurado
		int result=0;
		if(esquerda > direita) {
			result = -1;
		}
		int meio = (esquerda+direita)/2;
		
		if(vetorA[meio] == x) {
			result = meio;
		} else if(x < vetorA[meio]) {
			return buscaBinaria(vetorA, esquerda, meio-1, x);
		} else if(x > vetorA[meio]) {
			return buscaBinaria(vetorA, meio+1, direita, x);
		}
		return result;
	}

}
