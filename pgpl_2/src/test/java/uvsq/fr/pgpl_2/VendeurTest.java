package uvsq.fr.pgpl_2;

import org.junit.Test;
public class VendeurTest {
	


		@Test
		public void CalculSalaireVendeurTest() {
			Vendeur Vdr= new Vendeur("katherine",2016);
			Vdr.setCommission(20.5);
			assert (Vdr.calculSalaire()==1600.5);
		}
	}

