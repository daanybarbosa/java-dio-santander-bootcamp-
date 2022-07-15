package one.digitalinnovation.basecamp.ArraysEx3;

import java.util.Random;

/**
 * Ex 3 - Números Aleatórios
 *
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100); //limite para gerar os numeros randômicos (aleatorios)
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nNúmeros aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos números aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero + 1) + " ");
        }
    }
}
