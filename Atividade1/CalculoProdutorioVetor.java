package Atividade1;

public class CalculoProdutorioVetor {
	
	double CalculoProdutorio(double[] vetor, int n) { //n = vetor.length
		double result = 0;
		for(int i=0; i <= n; i = i + 1) {
			if (i%2 != 0) {
				result = result + vetor[i];
			}
		}
		return result;
	}

}
