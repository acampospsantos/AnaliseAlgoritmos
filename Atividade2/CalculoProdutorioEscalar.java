package Atividade2;

public class CalculoProdutorioEscalar {
	
	double CalculoProdutorio(double[] vetorA, double[] vetorB, int n) {
		double prodEscalar = 0;
		for(int i=0; i <= n; i=i+1) {
			prodEscalar = prodEscalar + vetorA[i] * vetorB[i];
		}
		return prodEscalar;
	}

}
