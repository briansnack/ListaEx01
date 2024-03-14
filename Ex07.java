import java.util.Scanner;

public class Ex07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Digite um número: ");
            int num = leitor.nextInt();

            if(num > 100 & num < 200){
                System.out.println("Número no intervalo de 100 a 200");
            } else{
                System.out.println("Número fora do intervalo de 100 a 200");
            }
        }
        leitor.close();
    }
}
