import java.util.Scanner;

public class Ex01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int num1 = leitor.nextInt();

        if(num1 > 10){
            System.out.println("Número maior do que 10!");
        } else{
            System.out.println("Número menor ou igual a 10!");
        }
        leitor.close();
    } 
}
