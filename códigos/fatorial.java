import java.util.Scanner;

public class fatorial{
    public static void traco(int qntd){
    for(int i = 0; i < qntd; i++){
        System.out.print("-");
    }
    System.out.println();
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Digite um número para calcular a fatorial do mesmo: ");
        int num = sc.nextInt();
        traco(60);
        int nm_usad = num;

        for(i = 1; i < num; i++){
            nm_usad *= i;
    }
        System.out.printf("O resultado da fatoração de %d é %d", num, nm_usad);
    sc.close();
}
}