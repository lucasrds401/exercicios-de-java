 import java.util.Scanner;

 public class maior_número{
        public static void traco(int qntd){
            for(int i = 0; i < qntd; i++){
            System.out.print("-");
        }
        System.out.println("");    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            int nm = sc.nextInt();
            traco(60);
            if(nm > maior){
                maior = nm;
            }
        }
        System.out.printf("O maior número da lista é o %d", maior);
        sc.close();
    }
}
