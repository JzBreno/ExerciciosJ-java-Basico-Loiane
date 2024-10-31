package Enum;

public class Main {
    public static void main(String[] args) {
        //criando array com os valores string do nosso enum e podendo iterar por eels
        Enumteste[] teste = Enumteste.values();
        int num = 3;
        for(int i=0;i< teste.length;i++){
            //analisando sobre o valor referente
            if(num == teste[i].getValor()){
                System.out.println(teste[i]);
                System.out.println(teste[i]);
            }
        }
        //usando for each para analisar
        for(Enumteste dia : teste){
            if(num == dia.getValor()){
                System.out.println(dia);
            }
        }
    }
}
