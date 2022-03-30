package Recursividade;

public class BuscaLinear { //Busca a posição que o elemento desejado está no Array (Recursivamente)
	
	int buscaLinear(int[] vetorA, int n, int x) { //VetorA -> Vetor, n -> Tamanho do Array, x -> Elemento desejado
		if (n==0) {
			return -1; //Valor retornado padrão (caso k não esteja dentro do vetor)
		}
		if (vetorA[n] == x) {
			return n;
		}
		return buscaLinear(vetorA, n-1, x);
	}

}
