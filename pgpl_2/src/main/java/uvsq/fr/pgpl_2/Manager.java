package uvsq.fr.pgpl_2;

public class Manager extends Employe {
	private int nbr;
	public Manager(String nom, int annee) {
		super(nom, annee);
		nbr=1;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	@Override
	public double calculSalaire() {
		return super.calculSalaire()+100*nbr;
	}
	

}
