import java.util.Scanner;

public class Ex08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Digite um número: ");
            int num = leitor.nextInt();

            if (num > 50) {
                System.out.println("Número maior que 50");
            } else{
                System.out.println("Número menor que 50");
            }
        leitor.close();
        }
    }
}
