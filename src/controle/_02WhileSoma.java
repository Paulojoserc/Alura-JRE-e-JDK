package controle;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class _02WhileSoma {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			total+= contador;
			contador++;
		}
		System.out.println(total);
	}
}
