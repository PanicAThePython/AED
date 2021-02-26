import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaEstaticaTest {

	@Test
	void busca() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(50);
		lista.inserir(-15);
		lista.inserir(12);
		lista.inserir(28);
		lista.inserir(91);
		lista.inserir(198);
		lista.inserir(-55);
		
		//assertEquals(1, lista.buscar(-15), "Iguais");
	}

	@Test
	void retirada() {
		ListaEstatica lista1 = new ListaEstatica();
		lista1.inserir(50);
		lista1.inserir(-15);
		lista1.inserir(12);
		lista1.inserir(28);
		lista1.inserir(91);
		lista1.inserir(198);
		lista1.inserir(-55);
		
		ListaEstatica lista2 = new ListaEstatica();
		lista2.inserir(50);
		lista2.inserir(12);
		lista2.inserir(28);
		lista2.inserir(91);
		lista2.inserir(198);
		lista2.inserir(-55);
		
		assertEquals(lista2, lista1.retirar(-15));
	}

}
