package java_rmi_tp1_communs.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import java_rmi_tp1_communs.classes.DossierDeSuivi;
import java_rmi_tp1_communs.classes.Espece;

public interface CabinetVeterinaire extends Remote{
	void ajouterAnimal(String nom, String nomMaitre, Espece espece,String race, DossierDeSuivi dossierDeSuivi) throws RemoteException;
    Animal chercherAnimalParNom(String nom) throws RemoteException;
    ArrayList<Animal> listerAnimaux() throws RemoteException;
    public void enregistrerObservateur(IClient client) throws RemoteException;
}
