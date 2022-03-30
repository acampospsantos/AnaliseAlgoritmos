package Atividade1;

public class CalculoMediaVetor { // Calcular a média dos elementos de um vetor;
	
	double CalculoMedia(double[] vetor, int n) { //n = vetor.length
		double soma = 0;
		for(int i=0; i <= vetor.length; i = i + 1) {
			soma = soma + vetor[i];
		}
		return soma/vetor.length;
	}

}
