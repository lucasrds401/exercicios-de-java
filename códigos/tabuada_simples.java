import java.util.Scanner;

public class tabuada_simples{
    public static void traco(int qntd) {
        for (int i = 0; i < qntd; i++){
            System.out.print("-");
        }
        System.out.println();
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número para ver sua tabuada: ");
            int nm = sc.nextInt();
            traco(60);

            for(int i = 0; i < 11; i++){
                System.out.printf("%d * %d = %d", i, nm, i*nm);
                System.out.println();
            }
            sc.close();
        }
}