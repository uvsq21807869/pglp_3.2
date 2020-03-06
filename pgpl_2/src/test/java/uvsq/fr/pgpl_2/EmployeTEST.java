package uvsq.fr.pgpl_2;
import org.junit.Test;
public class EmployeTEST {
	@Test
	public void CalculSalaireEmployeTest() {
		Employe Emp= new Employe("katherine",2016);
		assert (Emp.calculSalaire()==1580);
	}
	

}
