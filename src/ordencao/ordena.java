package ordencao;

import java.util.Random;

public class ordena {
    public static void main(String[] args) {

        //variaveis
        int[] vetor = new int[10];
        Random random = new Random();
        //incrementando valores random no vetor
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100);
        }

        System.out.println("Vetor antes de ser Ordenado: ");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        //ordenando
        for (int i = 1; i < vetor.length; i++) {
            for(int j=0;j<i;j++){
                if(vetor[j]<vetor[i]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }

            }
        }
        System.out.println(" ");
        System.out.println("Vetor ordenado em ordem crescente: ");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
