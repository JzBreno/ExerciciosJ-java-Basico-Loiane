package Exercicio1;
//questao 1 e 2
public class Main {
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i=0;i<vetorA.length;i++){
            vetorA[i]=i+1;
            vetorB[i] = vetorA[i] * 2;
        }

        for(int i=0;i<vetorB.length;i++){
            System.out.println(vetorB[i]);
        }
    }
}
