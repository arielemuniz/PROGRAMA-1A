import java.util.ArrayList;
import java.util.Collections;

public class NumeroDeClassificados {
	
	public ArrayList <Integer> notasCompetidores = new ArrayList<Integer>();
	private int N;
	private int K;
	
	public NumeroDeClassificados(ArrayList<Integer> competidores,int N, int K) {
		this.notasCompetidores = competidores;
		this.N = N;
		this.K = K;
	}
	
	public double calculaClassificados() {
		Collections.sort(notasCompetidores);
		double cont = K;
		int notaUltimoLugar = notasCompetidores.get(N-K);
		for(int i = notasCompetidores.size() - K-1; i>=0 ; i--) {
			if(notasCompetidores.get(i) == notaUltimoLugar) 
				cont++;
			else 
				break;	
		}
		return cont;
	}
	
	public double CalculaMa(double tam) {
		double soma = 0;
		for(int i = notasCompetidores.size()-1; i>=(N-tam) ; i--) 
			soma+=notasCompetidores.get(i);
		return soma/tam;	
	}
	
	public double CalculaDP(double tam) {
		double Ma = CalculaMa(tam);
		double soma = 0;
		for(int i = notasCompetidores.size()-1; i>=(N-tam) ; i--)
			soma+= ((notasCompetidores.get(i) - Ma)*(notasCompetidores.get(i) - Ma));
		return Math.sqrt(soma/tam);
	}
	
	public int getN() {
		return this.N;
	}
}
