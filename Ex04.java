import java.util.Scanner;

public class Ex04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Digite o primeiro número");
            int num1 = leitor.nextInt();

            System.out.println("Digite o segundo número");
            int num2 = leitor.nextInt();
        
            int soma = num1 + num2;
            int sub = num1 - num2;
            int multi = num1 * num2;
            double div = num1 / num2;

            System.out.println("Soma:" + soma);
            System.out.println("Subtração:" + sub);
            System.out.println("Multiplicação:" + multi);
            System.out.println("Divisão:" + div);
        }
        leitor.close();
    }
}
