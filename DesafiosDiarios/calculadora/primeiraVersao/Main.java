package primeiraVersao;

import java.util.Scanner;

/*
 * Objetivo: Crie uma classe chamada Calculadora que tenha os seguintes métodos:

soma(int a, int b): retorna a soma de a e b.
subtracao(int a, int b): retorna a subtração de a menos b.
multiplicacao(int a, int b): retorna o produto de a e b.
divisao(int a, int b): retorna a divisão de a por b. Lembre-se de tratar o caso em que b é igual a zero, retornando uma mensagem de erro.
 */

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Recebe dados do usuário
        System.out.print("Digite o primeiro número para ser cálculado: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número para ser cálculado");
        int numero2 = input.nextInt();

        // Recebe qual operação o usuário quer fazer
        System.out.printf("Qual operação deseja realizar: \nPara soma digite (1):\nPara subtração digite (2):");
        int operacao = input.nextInt();

       // Verifica qual operação e realiza o cálculo
       int resultado = 0;
       if (operacao == 1) {
           resultado = numero1 + numero2;
           System.out.printf("O resultado da soma foi: " + resultado);
       } else if (operacao == 2) {
           resultado = numero1 - numero2;
           System.out.printf("O resultado da subtração foi: " + resultado);

           input.close();
       }
        
    }
}