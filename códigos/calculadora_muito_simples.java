import java.util.Scanner;

public class calculadora_muito_simples{

    public static void traco(int qntd){
        for(int i = 0; i < qntd; i++){
        System.out.print("-");
    }
    System.out.println();
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int one_number = sc.nextInt();
    traco(60);

    System.out.print("Digite o segundo número: ");
    int second_number = sc.nextInt();
    traco(60);

    System.out.print("Tabela de operações\n[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n");
    traco(60);
    System.out.print("Digite a operação desejada: ");
    int op = sc.nextInt();
    traco(60);
    
    if(op == 1){
        System.out.printf("Soma: %d + %d = %d", one_number, second_number, one_number - second_number);
    }
    else if (op == 2){
        System.out.printf("Subtração: %d - %d = %d", one_number, second_number, one_number - second_number);
    }
    else if(op == 3){
        System.out.printf("Multiplicação: %d * %d = %d", one_number, second_number, one_number * second_number);
    }
    else{
        System.out.printf("Divisão: %d / %d = %d", one_number, second_number, one_number / second_number);
    }
    sc.close();
    }
}