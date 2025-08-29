import java.util.Scanner;

public class menu_de_opções{
    public static void traco(int qntd){
        for(int i = 0; i < qntd; i++){
            System.out.print("-");
        }
            System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        double conta = 0;

        while (op != 3) {
        System.out.print("\n[1] Adicionar valor na conta\n[2] Verificar dinheiro na conta\n[3] Sair\n");
        traco(60);
        System.out.print("Digite a opção que você deseja: ");
        op = sc.nextInt();
        traco(60);
        
        if(op == 1){
            System.out.print("Digite o valor para colocar na conta: ");
            conta += sc.nextDouble();
        }
        
        else if (op == 2){
            System.out.printf("Você tem R$%.2f na sua conta.\n", conta);
        }

        else if (op == 3){
            System.out.print("Volte sempre!");
            break;
        }

        System.out.print("Quer realizar mais uma ação [S/N]: ");
        String acao = sc.next();
        if (!acao.equalsIgnoreCase("S") || !acao.equalsIgnoreCase("s")){
            System.out.print("Volte sempre!");
            break;
        }
        
    }
        sc.close();
    }
    
}