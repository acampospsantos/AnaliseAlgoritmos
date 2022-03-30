package Recursividade;

public class BuscaLinear { //Busca a posi��o que o elemento desejado est� no Array (Recursivamente)
	
	int buscaLinear(int[] vetorA, int n, int x) { //VetorA -> Vetor, n -> Tamanho do Array, x -> Elemento desejado
		if (n==0) {
			return -1; //Valor retornado padr�o (caso k n�o esteja dentro do vetor)
		}
		if (vetorA[n] == x) {
			return n;
		}
		return buscaLinear(vetorA, n-1, x);
	}

}
