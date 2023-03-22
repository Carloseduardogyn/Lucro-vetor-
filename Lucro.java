package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Lucro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] mercadoria = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];

		for (int i = 0; i < n; i++) {
			mercadoria[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}

		int lucro10 = 00;
		int lucro10E20 = 00;
		int lucro20 = 00;

		for (int i = 0; i < n; i++) {

			double lucro = venda[i] - compra[i];
			double porcentagemLucro = lucro / compra[i] * 100.0;

			if (porcentagemLucro < 10.0) {
				lucro10++;

			} else if (lucro <= 20) {
				lucro10E20++;

			} else {
				lucro20++;
			}
		}
		
		System.out.println("Lucro abaixo de 10% " + lucro10);
		System.out.println("Lucro abaixo de 10% e 20% " + lucro10E20);
		System.out.println("Lucro acima de 20% " + lucro20);
		
		double compraTotal = 0.0;	
		double vendaTotal = 0.0;
		
		for(int i=0; i<n; i++) {
			compraTotal = compraTotal + compra[i];
			compraTotal++;	
			vendaTotal = vendaTotal + venda[i];
			vendaTotal++;
		}
		
		
		double lucroTotal = vendaTotal - compraTotal;
		
		
		System.out.printf("Valor total de compra: %.2f%n", compraTotal);
		System.out.printf("Valor total de venda: %.2f%n", vendaTotal);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);
		
		
		
		

		sc.close();

	}

}
