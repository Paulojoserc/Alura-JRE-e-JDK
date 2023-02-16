package controle;

public class _05Desafio {
public static void main(String[] args) {
	//Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
	
	int cont = 0;
	
	/*for (int i = 1; i < 100; i++) {
		if(i % 3 ==0) {
			System.out.println(i);
			cont++;
		}
		
	}
	*/
	
	 for (int i = 3; i < 100; i += 3 ){
         System.out.println(i);
         cont++;
     }
	
	System.out.println();
	System.out.println("total de numeros divisives por 3 é :"+cont);
	
	
}
}
