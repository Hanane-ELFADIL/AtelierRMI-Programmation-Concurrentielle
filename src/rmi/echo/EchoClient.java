package rmi.echo;

import java.rmi.Naming;

public class EchoClient {

    public static void main(String[] args) {

        try {

            Echo service = (Echo) Naming.lookup(
                    "rmi://localhost/EchoService"
            );

            // Test echo
            String rep = service.echo("Bonjour");

            System.out.println(rep);

            // Test length
            int taille = service.length("Bonjour");

            System.out.println("Longueur : " + taille);

            // Test objet Message
            Message msg = new Message("Test objet");

            Message reponse =
                    service.traiterMessage(msg);

            System.out.println(reponse.getContenu());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}