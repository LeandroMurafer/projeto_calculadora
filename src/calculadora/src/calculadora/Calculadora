package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 *
 * <p>Este módulo faz parte do sistema de cálculos financeiros do aplicativo FinançApp,
 * sendo utilizado em funcionalidades como cálculo de orçamento mensal,
 * divisão de despesas e projeção de economias.</p>
 *
 * @author Desenvolvedor Junior - FinançApp
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza uma operação matemática básica entre dois números inteiros.
     *
     * <p>Operações suportadas:</p>
     * <ul>
     *   <li>{@code "+"} — Soma</li>
     *   <li>{@code "-"} — Subtração</li>
     *   <li>{@code "*"} — Multiplicação</li>
     *   <li>{@code "/"} — Divisão</li>
     * </ul>
     *
     * @param a  O primeiro operando (dividendo no caso de divisão)
     * @param b  O segundo operando (divisor no caso de divisão)
     * @param op A operação matemática desejada: "+", "-", "*" ou "/"
     * @return O resultado da operação como {@code double},
     *         ou {@code Double.NaN} em caso de operação inválida ou divisão por zero
     */
    public double calc(int a, int b, String op) {
        // Validação: verifica se a operação fornecida é nula ou vazia
        if (op == null || op.trim().isEmpty()) {
            System.out.println("Erro: operação inválida. Use +, -, * ou /.");
            return Double.NaN;
        }

        // Seleciona e executa a operação correspondente
        switch (op.trim()) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                System.out.println("Erro: operação '" + op + "' não reconhecida. Use +, -, * ou /.");
                return Double.NaN;
        }
    }

    /**
     * Realiza a soma de dois valores inteiros.
     *
     * @param a Primeiro operando
     * @param b Segundo operando
     * @return A soma de {@code a} e {@code b}
     */
    private double somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração entre dois valores inteiros.
     *
     * @param a Minuendo (valor do qual se subtrai)
     * @param b Subtraendo (valor a ser subtraído)
     * @return A diferença entre {@code a} e {@code b}
     */
    private double subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois valores inteiros.
     *
     * @param a Primeiro fator
     * @param b Segundo fator
     * @return O produto de {@code a} e {@code b}
     */
    private double multiplicar(int a, int b) {
        return (double) a * b;
    }

    /**
     * Realiza a divisão entre dois valores inteiros.
     *
     * <p>Impede a divisão por zero, exibindo uma mensagem de erro e
     * retornando {@code Double.NaN} neste caso.</p>
     *
     * @param a Dividendo
     * @param b Divisor (não pode ser zero)
     * @return O quociente de {@code a} por {@code b},
     *         ou {@code Double.NaN} se {@code b} for zero
     */
    private double dividir(int a, int b) {
        // Proteção contra divisão por zero
        if (b == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            return Double.NaN;
        }
        return (double) a / b;
    }

    /**
     * Método principal para demonstração manual da calculadora.
     *
     * @param args Argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== FinançApp — Calculadora ===\n");

        System.out.println("10 + 5 = " + calc.calc(10, 5, "+"));
        System.out.println("10 - 5 = " + calc.calc(10, 5, "-"));
        System.out.println("10 * 5 = " + calc.calc(10, 5, "*"));
        System.out.println("10 / 5 = " + calc.calc(10, 5, "/"));
        System.out.println("10 / 0 = " + calc.calc(10, 0, "/"));
        System.out.println("10 % 5 = " + calc.calc(10, 5, "%"));
    }
}
