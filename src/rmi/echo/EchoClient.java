package rmi.echo;

import java.rmi.Naming;

public class EchoClient {

    public static void main(String[] args) {

        try {

            // URL du service distant
            String url = "rmi://localhost/EchoService";

            // Récupération de l'objet distant
            Echo echoService = (Echo) Naming.lookup(url);

            // Appel distant
            String reponse = echoService.echo("Bonjour serveur RMI");

            // Affichage
            System.out.println("Réponse du serveur : " + reponse);

        } catch (Exception e) {

            System.err.println("Erreur Client RMI : " + e.getMessage());

            e.printStackTrace();
        }
    }
}