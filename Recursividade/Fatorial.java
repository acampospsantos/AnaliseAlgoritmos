package Recursividade;

public class Fatorial { //RECURSIVO
	
	int calculoFatorial(int n) {
		if(n==0) {
			return 1;
		}
		return n * calculoFatorial(n-1);		
	}

}
