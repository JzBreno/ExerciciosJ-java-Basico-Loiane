package Exercicio2;

import java.util.Random;

public class Quadrado {
    public static void main(String[] args) {

        int[] numeros = new int[15];
        int[] vetorB = new int[15];
        Random random = new Random();
        for(int i =0;i<numeros.length;i++){
            numeros[i] = random.nextInt(10);
            vetorB[i] = numeros[i] * numeros[i];
        }
        for(int i =0;i<vetorB.length;i++){
            int quadrado = numeros[i]*numeros[i];
            if(vetorB[i] == quadrado){
                System.out.println("Valor de numero[i]: "+numeros[i]);
                System.out.println("Esta correto: "+vetorB[i]);
            }
        }


    }
}
