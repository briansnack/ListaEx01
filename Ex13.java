import java.util.Scanner;

public class Ex13 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{

            System.out.println("Digite o valor de A: ");
            double numA = leitor.nextDouble();

            System.out.println("Digite o valor de B: ");
            double numB= leitor.nextDouble();

            System.out.println("Escolha a operação( + , - , * ou /)");
            char operador = leitor.next().charAt(0);

            double resultado;
            switch (operador) {
                case '+':
                    resultado = numA + numB;
                    System.out.println("Resultado: " + resultado);
                    break;
            
                case '-':
                    resultado = numA - numB;
                    System.out.println("Resultado: " + resultado);
                    break;

                    case '*':
                    resultado = numA * numB;
                    System.out.println("Resultado: " + resultado);
                    break;

                    case '/':
                    if(numB != 0){
                    resultado = numA / numB;
                    System.out.println("Resultado: " + resultado);
                    } else{
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                default:
                System.out.println("Operador não definido");
                    break;
                }
            leitor.close();
        }
    }
}