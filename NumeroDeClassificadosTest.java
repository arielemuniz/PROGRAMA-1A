import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NumeroDeClassificadosTest {
	

	@Test
	public void testNigualK() {
		ArrayList<Integer> competidores = new ArrayList<Integer>();
		NumeroDeClassificados num = new NumeroDeClassificados(competidores,3,3);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(2);
		num.notasCompetidores.add(1);
		assertEquals(3,num.calculaClassificados(),0.0009);
	}
	
	@Test
	public void testEmpate() {
		ArrayList<Integer> competidores = new ArrayList<Integer>();
		NumeroDeClassificados num = new NumeroDeClassificados(competidores,4,3);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(1);
		num.notasCompetidores.add(2);
		num.notasCompetidores.add(1);
		assertEquals(4,num.calculaClassificados(),0.009);
	}
	
	@Test
	public void testNaoEmpate() {
		ArrayList<Integer> competidores = new ArrayList<Integer>();
		NumeroDeClassificados num = new NumeroDeClassificados(competidores,4,3);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(2);
		num.notasCompetidores.add(1);
		assertEquals(3,num.calculaClassificados(),0.009);
	}
	
	@Test
	public void testCalculaMa() {
		ArrayList<Integer> competidores = new ArrayList<Integer>();
		NumeroDeClassificados num = new NumeroDeClassificados(competidores,4,3);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(2);
		num.notasCompetidores.add(1);
		assertEquals(2.25,num.CalculaMa(4),0.009);
	}
	
	@Test
	public void testCalculaDP() {
		ArrayList<Integer> competidores = new ArrayList<Integer>();
		NumeroDeClassificados num = new NumeroDeClassificados(competidores,10,3);
		num.notasCompetidores.add(1);
		num.notasCompetidores.add(2);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(4);
		num.notasCompetidores.add(5);
		num.notasCompetidores.add(5);
		num.notasCompetidores.add(4);
		num.notasCompetidores.add(3);
		num.notasCompetidores.add(2);
		num.notasCompetidores.add(1);
		assertEquals(1.41,num.CalculaDP(10),0.009);
	}
}
