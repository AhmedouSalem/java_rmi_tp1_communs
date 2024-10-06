package java_rmi_tp1_communs.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClient extends Remote {
    void recevoirNotification(String message) throws RemoteException;
}