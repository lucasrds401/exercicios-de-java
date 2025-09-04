import java.util.Scanner;

public class alistamento_militar{
    public static void traco(int qntd){
        for(int i = 0; i < qntd; i++){
            System.out.print("-");
        }
            System.out.println("");
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        traco(60);
        System.out.printf("Olá %s, digite o ano que você nasceu: ", nome);
        int ano = sc.nextInt();
        traco(60);
        int idade = 2025 - ano;
        if (idade >= 18){
            System.out.printf("Você tem %d anos, ou seja, já pode se alistar!", idade);
        }
        else{
            System.out.printf("Você tem %d anos, ou seja, não pode se alistar! \nVocê poderá se alistar no ano de %d", idade, 2025 + (18 - idade));
        }
        sc.close();
    }
}