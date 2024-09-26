package segundaVersao;

/*
 * Criar uma casse Calculadora Teste para executar todas as operações possíveis da classe calculadora
 */

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Eu quero que o usuário coloque dois números da escolha dele para o cálculo
        // Eu quero dar a opção do usuário escolher qual operação ele quer fazer
        // Quero retorna pra ele o resultado da operação

        // Pegar números do usuário
        float primeiroNumero;
        float segundoNumero;

        System.out.print("Digite o primeiro número para realizar o cálculo: ");
        primeiroNumero = input.nextFloat();
        System.out.println();

        System.out.print("Digite o segundo nuúmero: ");
        segundoNumero = input.nextFloat();
        System.out.println();

        // Pegar qual cálculo o usuário quer fazer
        int soma, subtracao, multiplicacao, divisao;
        
        System.out.print("Qual operação deseja realizar? \nAs opções são as seguintes:");
        System.out.print("\nDigite '1' para soma.\nDigite '2' para subtração.\nDigite '3' para multiplicação.\nDigite '4' para divisão.");

        // Continar desafio escrevendo estrutura para lidar com as operações.
    }
}