package application;

import java.util.Arrays;

public class Program {
	
	public static int globalValue = 3;

	public static void main(String[] args) {
		
		// FUNÇÃO REFERENCIAL NÃO TRANSPARENTE
		 /*pois o resultado depende de um valor que está fora de  
		  *de sua função.  */
		 
		
		int[] vect = new int[] {3, 4, 5};
		   changeOddValues(vect);// muda os valores impares,
		     System.out.println(Arrays.toString(vect));
		}
		
		public static void changeOddValues(int[] numbers) {
		   for (int i=0; i<numbers.length; i++) {
		      if (numbers[i] % 2 != 0) {
		        numbers[i] += globalValue; /* resultado da função depende exclusivamente do valor
		                                   / de entrada, neste caso o globalValue, que está fora 
		                                   / da função.*/
		      }
		   }
   }
}

              // SAÍDA
              // [6, 4, 8]