package Recursividade;

public class Potencia {
	
	int calculoPotencia(int x, int n) { //x -> base da potencia, n -> expoente
		if(n==0) {
			return 1;
		}
		return x * calculoPotencia(x, n-1);
	}

}
