import java.util.Scanner;

public class Ex02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Primeiro número: ");
            int num1 = leitor.nextInt();

            System.out.println("Segundo número: ");
            int num2 = leitor.nextInt();

            int soma = num1 + num2;

            System.out.println("Soma dos números: " + soma);
            
            leitor.close();
        }
    } 
}
