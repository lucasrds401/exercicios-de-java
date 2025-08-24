import java.util.Scanner;

public class sorteador{

    public static void traco(int qntd){
        for(int i = 0; i < qntd; i++){
            System.out.print("-");
        }
            System.out.println();
    }
    public static void main(String[] args) {
        int cont = 1;
        Scanner sc = new Scanner(System.in);
        int sorteio = (int) (Math.random() * 10) + 1;


        System.out.print("Pensei em um número de 1 a 10, diga o número que você acha que pensei: ");
        int nm = sc.nextInt();
        traco(60);
        
        while (nm != sorteio){
            cont += 1;
            System.out.print("Você errou, tente novamente: ");
            nm = sc.nextInt();
        }

        traco(60);
        System.out.printf("Você acertou, o número era %d. Foram %d tentativas!", sorteio, cont);
    
        sc.close();
    }
}