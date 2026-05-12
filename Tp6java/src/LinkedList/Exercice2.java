package LinkedList;


import java.util.*;

class Client {
    int numero;
    String nom;

    Client(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    
    public String toString() {
        return "Client{num=" + numero + ", nom='" + nom + "'}";
    }
}

public class Exercice2 {
    public static void main(String[] args) {
        LinkedList<Client> file = new LinkedList<>();

        
        file.add(new Client(1, "Ahmed"));
        file.add(new Client(2, "Nadia"));
        file.add(new Client(3, "Karim"));

       
        System.out.println("File d’attente : " + file);

        
        Client servi = file.poll();
        System.out.println("Client servi : " + servi);

       
        file.add(new Client(4, "Samira"));

        
        System.out.println("Client en tête : " + file.peek());
    }
}
