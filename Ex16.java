import java.util.Scanner;

public class Ex16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Nota 1: ");
            double nota1 = leitor.nextDouble();

            System.out.println("Nota 2: ");
            double nota2 = leitor.nextDouble();

            System.out.println("Nota 3: ");
            double nota3 = leitor.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Média: " + media);
            
            leitor.close();
        }
    }
}
