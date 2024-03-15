import java.util.Scanner;

public class Ex09 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Digite o primeiro número: ");
            int num1 = leitor.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = leitor.nextInt();

            if(num1 == num2){
                System.out.println("Números iguais");
            } else if(num1 > num2){
                System.out.println("Primeiro número é maior: " + num1);
            } else {
                System.out.println("Segundo número é maior: " + num2);
            }


            leitor.close();
        }
    }
}
