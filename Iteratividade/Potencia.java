package Iteratividade;

public class Potencia {
	
	int calculoPotencia(int x, int n) { //x -> base da potencia, n -> expoente
		int resultado=1;
		for(int i=1; i<=n; i=i+1) {
			resultado = resultado * x;
		}
		return resultado;
	}
	
	/* 
	 int calculo(int x, int n) {
		 int resultado;
		 resultado = (int) Math.pow(x, n);
		 return resultado;
	 }
	*/
	     
	

}
