/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somanumerospositivos;

/**
 *
 * @author CaioBraz
 */
import java.util.Scanner;

public class SomaNumerosPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int numero;
        
        System.out.println("Digite números positivos. Digite um número negativo para encerrar.");
        
        numero = scanner.nextInt();
        
        while (numero >= 0) {
            soma += numero;
            numero = scanner.nextInt();
        }
        
        System.out.println("Soma total dos números positivos: " + soma);
        
        scanner.close();
    }
}
