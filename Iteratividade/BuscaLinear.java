package Iteratividade;

public class BuscaLinear { //Busca a posição que o elemento desejado está no Array (Iterativamente)
	
	int buscaLinear(int[] vetorA, int n, int k) { //VetorA -> Vetor, n -> Tamanho do Array, k -> Elemento desejado
		int i=1;
		while(i <= n) {
			if (vetorA[i] == k) {
				return i;
			}
			i = i + 1;
		}
		return -1; //Valor retornado padrão (caso k não esteja dentro do vetor)
	}

}
