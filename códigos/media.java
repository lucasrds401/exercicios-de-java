import java.util.Scanner;

public class media{
    public static void traco(int qntd){
        for(int i = 0; i < qntd; i++){
            System.out.print("-");
        }
            System.out.println("");
    }

    public static void funcao_media(int notas, Scanner sc){
        double media = 0;
        for(int i = 0; i < notas; i++){
            System.out.printf("Digite a %dº nota: ", i + 1);
            media += sc.nextDouble();
        }
        System.out.printf("A média é: %.2f", media/notas);
    }
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de notas: ");
        int qntd_notas = sc.nextInt();
        traco(60);
        funcao_media(qntd_notas, sc);
        sc.close();
    }
}