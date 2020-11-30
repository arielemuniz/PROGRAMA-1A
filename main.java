import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class main {
	 public static void main(String[] args) {
		  ArrayList<Integer> competidores = new ArrayList<Integer>();
		  Scanner ler = new Scanner(System.in);
		  int N, K;
		  N = ler.nextInt();
		  K = ler.nextInt();
		  NumeroDeClassificados num = new NumeroDeClassificados(competidores,N,K);
		  for(int i=0; i<N; i++) {
			  int nota = ler.nextInt();
			  num.notasCompetidores.add(nota);
		  }
		  double num_class = num.calculaClassificados();
		  double des_class = num.CalculaDP(num_class);
		  double arit_class = num.CalculaMa(num_class);
		  double des_comp = num.CalculaDP(N);
		  double arit_comp = num.CalculaMa(N);
		  System.out.printf("%.0f\n", num_class);
		  System.out.printf("%.2f\n", des_class);
		  System.out.printf("%.2f\n", arit_class);
		  System.out.printf("%.2f\n", des_comp);
		  System.out.printf("%.2f\n", arit_comp);
	 }
}
