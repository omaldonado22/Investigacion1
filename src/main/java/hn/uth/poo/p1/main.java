/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author DELL
 */
public class main {

    static Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    static String[] MNombresDiario = new String[100];
    static String[] MNombresSemanal = new String[100];
    static String[] MNombresMensual = new String[100];
    static int contadorDiarios = 0;
    static int contadorSemanales = 0;
    static int contadorMensuales=0;
    static int [][]Matriz1= new int [20][5];
    static int [][]Matriz2= new int [50][2];
    static int []Matriz3= new int [100];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int opcion = 0;
            //boolean Seguir=true;
            do {

                System.out.println("***LOTERIA*** ");
                System.out.println("1. Vender Diario ");
                System.out.println("2. Vender Semanal");
                System.out.println("3. Vender Mensual");
                System.out.println("4. Juego Diario");
                System.out.println("5. Juego Semanal");
                System.out.println("6. Juego Mensual");
                System.out.println("Seleccione una opcion ");
                opcion = capturador.nextInt();
                switch (opcion) {
                    case 1:
                        VenderDiario();
                        break;
                    case 2:
                        VenderSemanal();
                        break;
                    case 3:
                        VenderMensual();

                        break;
                    case 4:
                        JuegoDiario();
 
                        break;
                    case 5:
                        JuegoSemanal();

                        break;
                    case 6:
                        JuegoMensual();
                        break;
                    case 7:

                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                    //Seguir = false;

                }
            } while (opcion != 7);

        } catch (Exception e) {

        }
    }

    private static void VenderDiario() {
        String Nombre;
        int numeroUsuario;
        int contador = 0;
        boolean Existe = true;
        System.out.println("Ingrese su nombre");
        Nombre = capturador.next();
        contadorDiarios++;
        //for (int i = 0; i < 100; i++) {
        MNombresDiario[contadorDiarios] = Nombre;

        do {

            System.out.println("Ingrese un numero de loteria");
            numeroUsuario = capturador.nextInt();
            for (int i = 0; i <= 5; i++) {
                if (numeroUsuario == Matriz1[contadorDiarios][i]) {
                    Existe = true;
                    System.out.println("Ese numero ya esta vendido, ingrese otro");
                    break;
                } else {
                    Matriz1[contadorDiarios][i] = numeroUsuario;
                    Existe = false;
                    break;

                }
            }
            if (Existe == false) {
                contador++;
            }
        } while (contador < 5);

        for (int j = 0; j < 5; j++) {
            System.out.println(Matriz1[contadorDiarios][j]);
        }
    }

    private static void VenderSemanal() {
        String NombreSemanal;
        int numeroUsuario;
        int contador = 1;
        boolean Existe = true;
        System.out.println("Ingrese su nombre");
        NombreSemanal = capturador.next();
        for (int i = 0; i < 100; i++) {
            MNombresSemanal[i] = NombreSemanal;

        }
        do {

            System.out.println("Ingrese un numero de loteria");
            numeroUsuario = capturador.nextInt();
            for (int i = 0; i < 2; i++) {
                if (numeroUsuario == Matriz2[contadorSemanales][i]) {
                    Existe = true;
                    System.out.println("Ese numero ya esta vendido, ingrese otro");
                    break;
                } else {
                    Matriz2[contadorSemanales][i] = numeroUsuario;
                    Existe = false;
                    break;

                }
            }
            if (Existe == false) {
                contador++;
            }
        } while (contador < 3);

    }

    private static void VenderMensual() {
      
        String NombreMensual;
        int numeroUsuario;
        boolean Existe=true;
        int contador=0;
        System.out.println("Ingrese su nombre");
        NombreMensual = capturador.next();
        System.out.println("Ingrese su numero de loteria");
        numeroUsuario = capturador.nextInt();
   
        for (int r = 1; r < 2; r++) {
            if (numeroUsuario == Matriz3[contadorMensuales]) {
                Existe = true;
                System.out.println("Ese numero ya esta vendido, ingrese otro");
                break;
            } else {
                Matriz3[contadorMensuales] = numeroUsuario;
                Existe = false;
                break;
            }
        }
        if (Existe == false) {
            contador++;
        }
    }


private static void JuegoDiario() {
        int ArregloDiario[] = new int[5];
        System.out.println("Numeros Ganadores del Juego Diario son: ");
        for (int i = 0; i < 5; i++) {
                ArregloDiario[i] = Aleatorio(0, 100);
                
            System.out.println(ArregloDiario[i]);
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {

            }
        }
    }
    private static void JuegoSemanal(){
        int ArregloSemanal[]= new int[2];
       System.out.println("Numeros Ganadores del Juego Semanal son: ");
        for (int i = 0; i <=2; i++) {
            ArregloSemanal[i]=Aleatorio(0,100);
            System.out.println(ArregloSemanal[i]);
        }
        
    }
    private static void JuegoMensual(){
        int ArregloMensual[]=new int[1];
        System.out.println("Numero Ganador del Juego Mensual es: ");
        for (int i = 0; i < 1; i++) {
            ArregloMensual[i]=Aleatorio(0,100);
            System.out.println(ArregloMensual[i]);
            
        }
        
    }
    private static int Aleatorio(int maximo, int minimo) {
        return (int) (Math.random() * ((maximo - minimo) + 1)) + minimo;
    }

}
