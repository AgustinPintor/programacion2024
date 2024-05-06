/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;

/**
 *
 * @author Agustín
 */
public class TestTweets {
     public static void main(String[] args) {
     
        String tweet1 = "Hola soy agustin️";
        String tweet2 = "Tweet largo:saaiweihiuhfuiehioweroiuifrgirguitiugheuierjsdgfuywewejfoierjgiohtuihgoperiorighehptpojhigriogergergerhthh";
        String tweet3 = "¡Hola @usuario! ¿como te llamas?";

       
        System.out.println("Tweet 1: " + tweet1);
        System.out.println("Longitud: " + tweet1.length() + " caracteres");
        System.out.println("¿Cumple con el límite de 280 caracteres? " + Tweets.verificarLongitudTweet(tweet1));
        System.out.println("Tweet con hashtag: " + Tweets.agregarHashtag(tweet1, "Java"));

        System.out.println();

        System.out.println("Tweet 2: " + tweet2);
        System.out.println("Longitud: " + tweet2.length() + " caracteres");
        System.out.println("¿Cumple con el límite de 280 caracteres? " + Tweets.verificarLongitudTweet(tweet2));
        System.out.println("Tweet con hashtag: " + Tweets.agregarHashtag(tweet2, "programación"));

        System.out.println();

        
        System.out.println("Tweet 3: " + tweet3);
        System.out.println("Nombre de usuario: " + Tweets.extraerNombreUsuario(tweet3));

        System.out.println();

      
        String fragmento1 = "¡Nuevo tweet! ";
        String fragmento2 = "Este es un ";
        String fragmento3 = "tweet construido ";
        String fragmento4 = "a partir de varios fragmentos.";

        System.out.println("Nuevo tweet construido: " + Tweets.construirTweet(fragmento1, fragmento2, fragmento3, fragmento4));
    }
    
}
