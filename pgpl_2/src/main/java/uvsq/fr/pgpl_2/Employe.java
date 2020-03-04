package uvsq.fr.pgpl_2;

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
}
