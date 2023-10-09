package gqs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void quarentaRetornaD() {
		Nota n = new Nota();
		assertEquals('D', n.retornaConceitoNota(Float.parseFloat("40.0")));
	}

	@Test
	void cinquentaRetornaC() {
		Nota n = new Nota();
		assertEquals('C', n.retornaConceitoNota(Float.parseFloat("50.0")));
	}
	
	@Test
	void sessentaNoveRetornaC() {
		Nota n = new Nota();
		assertEquals('C', n.retornaConceitoNota(Float.parseFloat("69.0")));
	}
	
	@Test
	void setentaUmRetornaB() {
		Nota n = new Nota();
		assertEquals('B', n.retornaConceitoNota(Float.parseFloat("71.0")));
	}
	
	@Test
	void oitentaNoveRetornaB() {
		Nota n = new Nota();
		assertEquals('B', n.retornaConceitoNota(Float.parseFloat("89.0")));
	}
	
	@Test
	void noventaUmRetornaA() {
		Nota n = new Nota();
		assertEquals('A', n.retornaConceitoNota(Float.parseFloat("91.0")));
	}
}
