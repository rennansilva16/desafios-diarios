package segundaVersao;

/*
 * Objetivo: Crie uma classe chamada Calculadora que tenha os seguintes métodos:

soma(int a, int b): retorna a soma de a e b.
subtracao(int a, int b): retorna a subtração de a menos b.
multiplicacao(int a, int b): retorna o produto de a e b.
divisao(int a, int b): retorna a divisão de a por b. Lembre-se de tratar o caso em que b é igual a zero, retornando uma mensagem de erro.
 */

public class Calculadora {
    public int soma (int a, int b) {
        return a + b;
    }

    public int subtracao (int a, int b) {
        return a - b;
    }

    public int multiplicacao (int a, int b) {
        return a * b;
    }

    public double divisao (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida");
        }
        return a / b;
    }
}
