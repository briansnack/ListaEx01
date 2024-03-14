import java.util.Scanner;

public class Ex03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Número A: ");
            int num1 = leitor.nextInt();

            System.out.println("Número B: ");
            int num2 = leitor.nextInt();

            if (num1 > num2) {
                System.out.println("Número A é maior");
            } else if(num1 == num2){
                System.out.println("Sequência de números informada inválida");
            } else{
                System.out.println("Número B é maior");
            }
        }
        leitor.close();
    }
}
