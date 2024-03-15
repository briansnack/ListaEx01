import java.util.Scanner;

public class Ex17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Nota 1: ");
            double nota1 = leitor.nextDouble();
            
            System.out.println("Peso 1: ");
            double peso1 = leitor.nextDouble();
            
            System.out.println("Nota 2: ");
            double nota2 = leitor.nextDouble();
            
            System.out.println("Peso 2: ");
            double peso2 = leitor.nextDouble();
            
            System.out.println("Nota 3: ");
            double nota3 = leitor.nextDouble();
            
            System.out.println("Peso 3: ");
            double peso3 = leitor.nextDouble();
            
            double mediaP = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
            
            System.out.println("Média ponderada: " + mediaP);
            leitor.close();
        }
    }
}
