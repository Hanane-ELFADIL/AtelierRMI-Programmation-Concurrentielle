package rmi.echo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Echo extends Remote {

    String echo(String msg) throws RemoteException;

    int length(String msg) throws RemoteException;

    Message traiterMessage(Message msg) throws RemoteException;
}