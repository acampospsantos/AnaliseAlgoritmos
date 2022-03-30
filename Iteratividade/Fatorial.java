package Iteratividade;

public class Fatorial { //ITERATIVO
	
	int calculoFatorial(int n) {
		int resultado = 1;
		for(int i=1; i <= n; i=i+1) {
			resultado = resultado * i;
		}
		return resultado;
	}

}
