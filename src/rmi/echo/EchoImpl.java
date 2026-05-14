package rmi.echo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoImpl extends UnicastRemoteObject implements Echo {

    public EchoImpl() throws RemoteException {
        super();
    }

    @Override
    public String echo(String msg) throws RemoteException {

        System.out.println("Message reçu : " + msg);

        return "[Serveur RMI] Recu : " + msg;
    }
}