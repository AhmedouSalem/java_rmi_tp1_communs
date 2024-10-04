package java_rmi_tp1_communs.classes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DossierDeSuivi implements Serializable {
	String dateVaccination = "";

	public DossierDeSuivi() {
		// TODO Auto-generated constructor stub
	}
	
	public DossierDeSuivi(String dateVaccination) {
		this.dateVaccination = dateVaccination;
	}

	public String getDateVaccination() {
		return dateVaccination;
	}

	public void setDateVaccination(String dateVaccination) {
		this.dateVaccination = dateVaccination;
	}
	
	public String infosDossierSuivi() {
		return "\nDate de la prochaine vaccination : " + this.getDateVaccination();
	}
}
