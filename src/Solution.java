
import java.io.*;
import java.util.*;

// Distàncies matriu:

/* Suposem la següent taula amb distàncies quilomètriques següents. Donats els noms de dos poblacions, calcula la seva distància. Quan creïs la matriu et tocarà acabar de definir els espais en buit.

image

Input Format

Donem l'string corresponent a la ciutat1 i l'string corresponent a la ciutat2.

Constraints

No n'hi ha.

Output Format

S'imprimeix la distància entre les dues ciutats.

Sample Input 0

Barcelona
Girona
Sample Output 0

100
Sample Input 1

Girona
Barcelona
Sample Output 1

100
Sample Input 2

Saragossa
Terol
Sample Output 2

181
Sample Input 3

Barcelona
Barcelona
Sample Output 3

0

 */


public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Ciudad1 = sc.nextLine();
        String Ciudad2 = sc.nextLine();

        int[][] Cuadrante = {
                {0,100,156,98,296,409},
                {100,0,256,198,396,509},
                {156,256,0,91,140,319},
                {98,198,91,0,231,311},
                {296,396,140,231,0,181},
                {409,509,319,311,181,0}
        };


        int Ciudad11 = 0;
        int Ciudad22 = 0;

        if (Ciudad1.equals("Barcelona"))
        {
            Ciudad11 = 1;
        }
        else if (Ciudad1.equals("Girona"))
        {
            Ciudad11 = 2;
        }
        else if (Ciudad1.equals("Lleida"))
        {
            Ciudad11 = 3;
        }
        else if (Ciudad1.equals("Tarragona"))
        {
            Ciudad11 = 4;
        }
        else if (Ciudad1.equals("Saragossa"))
        {
            Ciudad11 = 5;
        }
        else if (Ciudad1.equals("Terol"))
        {
            Ciudad11 = 6;
        }


        if (Ciudad2.equals("Barcelona"))
        {
            Ciudad22 = 1;
        }
        else if (Ciudad2.equals("Girona"))
        {
            Ciudad22 = 2;
        }
        else if (Ciudad2.equals("Lleida"))
        {
            Ciudad22 = 3;
        }
        else if (Ciudad2.equals("Tarragona"))
        {
            Ciudad22 = 4;
        }
        else if (Ciudad2.equals("Saragossa"))
        {
            Ciudad22 = 5;
        }
        else if (Ciudad2.equals("Terol"))
        {
            Ciudad22 = 6;
        }


        System.out.println(Cuadrante[Ciudad11-1][Ciudad22-1]);

    }
}
