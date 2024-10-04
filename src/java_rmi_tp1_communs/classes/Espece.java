package java_rmi_tp1_communs.classes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Espece implements Serializable{
	private String nomEspece ;
	private int dureeVieMoy;
	public Espece(String nomEspece, int dureeVieMoy) {
		this.nomEspece = nomEspece;
		this.dureeVieMoy = dureeVieMoy;
	}
	
	public String getNomEspece() {
		return nomEspece;
	}
	
	public int getDureeVieMoy() {
		return dureeVieMoy;
	}
	
	@Override
	public String toString() {
		return "(nomEspece : " + this.getNomEspece() + ", duree de vie moy  : " + this.getDureeVieMoy() + ")";
	}

}
