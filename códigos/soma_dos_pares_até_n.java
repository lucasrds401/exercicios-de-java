import java.util.Scanner;

public class soma_dos_pares_até_n{
    public static void traco(int qntd){
        for(int i = 0; i < qntd; i++){
        System.out.print("-");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para começar a soma: ");
        int ini = sc.nextInt();
        traco(60);
        System.out.print("Digite um número para terminar a soma: ");
        int fim = sc.nextInt();
        traco(60);
        int soma = 0;
        for(int i = ini; i <= fim; i++){
            soma += i;
        }
        System.out.printf("A soma de todos os números de %d até %d é: %d", ini, fim, soma);
        sc.close();
    }
}