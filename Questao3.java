import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação (soma, subtracao, multiplicacao, divisao):");
        String operacao = scanner.next();

        double resultado = calcular(num1, num2, operacao);

        System.out.println("O resultado da " + operacao + " é: " + resultado);

        scanner.close();
    }

    public static double calcular(double num1, double num2, String operacao) {
        switch (operacao) {
            case "soma":
                return num1 + num2;
            case "subtracao":
                return num1 - num2;
            case "multiplicacao":
                return num1 * num2;
            case "divisao":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return 0;
                }
            default:
                System.out.println("Erro: Operação inválida.");
                return 0;
        }
    }
}




