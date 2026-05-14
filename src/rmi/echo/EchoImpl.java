package rmi.echo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoImpl extends UnicastRemoteObject implements Echo {

    public EchoImpl() throws RemoteException {
        super();
    }

    @Override
    public String echo(String msg) throws RemoteException {

        return "[Serveur RMI] Recu : " + msg;
    }

    @Override
    public int length(String msg) throws RemoteException {

        return msg.length();
    }

    @Override
    public Message traiterMessage(Message msg)
            throws RemoteException {

        return new Message(
                "[Serveur] Message reçu : " + msg.getContenu()
        );
    }
}