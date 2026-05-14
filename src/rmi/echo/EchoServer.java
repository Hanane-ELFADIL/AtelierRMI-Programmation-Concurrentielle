package rmi.echo;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class EchoServer {

    public static void main(String[] args) {

        try {

            // Création du registre RMI
            LocateRegistry.createRegistry(1099);

            // Création de l'objet distant
            EchoImpl od = new EchoImpl();

            // Publication dans le registre
            Naming.rebind("rmi://localhost/EchoService", od);

            System.out.println("Serveur RMI Echo pret.");

        } catch (Exception e) {

            System.err.println("Erreur Serveur RMI : " + e.getMessage());

            e.printStackTrace();
        }
    }
}