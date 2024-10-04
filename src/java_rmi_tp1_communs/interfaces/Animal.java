package java_rmi_tp1_communs.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Animal extends Remote{
	public String printAnimalInfos() throws RemoteException;
	public void setDateVaccination(String dateDeVaccination) throws RemoteException;
	public String getDateVaccination() throws RemoteException;
	public String getNom() throws RemoteException;
}
