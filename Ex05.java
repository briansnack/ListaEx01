import java.util.Scanner;

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Digite o primeiro número");
            int numA = leitor.nextInt();

            System.out.println("Digite o segundo número");
            int numB = leitor.nextInt();

            int aux = numA;
            numA = numB;
            numB = aux;

            System.out.println("Valor original primeiro número: " + numB);
            System.out.println("Valor original segundo número: " + numA);
            System.out.println("");
            System.out.println("Valor alterado do primeiro número: " + numA);
            System.out.println("Valor alterado do segundo número: " + numB);
        }
        leitor.close();
    }
}
