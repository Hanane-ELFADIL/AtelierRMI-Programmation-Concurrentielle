package rmi.echo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Service distant Echo : renvoie un message base sur la chaine recue.
 */
public interface Echo extends Remote {

    String echo(String msg) throws RemoteException;
}