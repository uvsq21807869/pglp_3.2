package uvsq.fr.pgpl_2;

import java.util.Calendar;

public class Employe {
	private final String nomEmp;
	private final int annee_arr;
	
	public Employe(String nom,int annee) {
		this.nomEmp = nom;
		this.annee_arr=annee;
	

}

	public String getNomEmp() {
		return nomEmp;
	}

	public int getAnnee_arr() {
		return annee_arr;
	}
	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int annee_courante = c.get(Calendar.YEAR);
		return 1500+20*(annee_courante-annee_arr);
	}
}
