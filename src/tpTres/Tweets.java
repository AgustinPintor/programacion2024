/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;

/**
 *
 * @author Agustín
 */
public class Tweets {
   
    public static boolean verificarLongitudTweet(String tweet) {
        return tweet.length() <= 280;
    }

   
    public static String agregarHashtag(String tweet, String hashtag) {
        return tweet + " #" + hashtag;
    }

   
    public static String extraerNombreUsuario(String tweet) {
        int indiceArroba = tweet.indexOf('@');
        if (indiceArroba != -1) {
            int indiceEspacio = tweet.indexOf(' ', indiceArroba);
            if (indiceEspacio != -1) {
                return tweet.substring(indiceArroba, indiceEspacio);
            } else {
                return tweet.substring(indiceArroba);
            }
        }
        return null;
    }

    
    public static String construirTweet(String... fragmentos) {
        StringBuilder nuevoTweet = new StringBuilder();
        for (String fragmento : fragmentos) {
            nuevoTweet.append(fragmento);
        }
        return nuevoTweet.toString();
    }
}
