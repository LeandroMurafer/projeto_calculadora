package calculadora;

/**
 * Classe de testes unitários para a classe {@link Calculadora}.
 *
 * <p>Valida o comportamento de todas as operações matemáticas implementadas,
 * incluindo casos de erro como divisão por zero e operações inválidas.</p>
 *
 * <p>Cada teste exibe: entrada utilizada, resultado esperado e resultado obtido,
 * indicando se o teste foi aprovado (✓ PASSOU) ou reprovado (✗ FALHOU).</p>
 *
 * @author Desenvolvedor Junior - FinançApp
 * @version 1.0
 */
public class TesteCalculadora {

    /** Instância da calculadora utilizada em todos os testes. */
    private static final Calculadora calc = new Calculadora();

    /** Contador de testes executados. */
    private static int totalTestes = 0;

    /** Contador de testes aprovados. */
    private static int testesPassados = 0;

    /** Contador de testes reprovados. */
    private static int testesFalhados = 0;

    /**
     * Método principal que executa todos os testes unitários.
     *
     * @param args Argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("     TESTES UNITÁRIOS — FinançApp Calculadora");
        System.out.println("============================================================\n");

        testarSoma();
        testarSubtracao();
        testarMultiplicacao();
        testarDivisao();
        testarDivisaoPorZero();
        testarOperacaoInvalida();

        exibirResumo();
    }

    // =========================================================
    // TESTES DE SOMA
    // =========================================================

    /**
     * Executa os testes relacionados à operação de soma.
     *
     * <p>Cobre: soma de positivos, negativos e zero.</p>
     */
    private static void testarSoma() {
        System.out.println("--- TESTE 1: SOMA ---");

        // Soma de dois positivos
        assertIgual(
            "Soma de positivos (10 + 5)",
            15.0,
            calc.calc(10, 5, "+")
        );

        // Soma com número negativo
        assertIgual(
            "Soma com negativo (-3 + 8)",
            5.0,
            calc.calc(-3, 8, "+")
        );

        // Soma com zero
        assertIgual(
            "Soma com zero (7 + 0)",
            7.0,
            calc.calc(7, 0, "+")
        );

        System.out.println();
    }

    // =========================================================
    // TESTES DE SUBTRAÇÃO
    // =========================================================

    /**
     * Executa os testes relacionados à operação de subtração.
     *
     * <p>Cobre: resultado positivo, resultado negativo e subtração de zero.</p>
     */
    private static void testarSubtracao() {
        System.out.println("--- TESTE 2: SUBTRAÇÃO ---");

        // Resultado positivo
        assertIgual(
            "Subtração com resultado positivo (10 - 4)",
            6.0,
            calc.calc(10, 4, "-")
        );

        // Resultado negativo
        assertIgual(
            "Subtração com resultado negativo (3 - 9)",
            -6.0,
            calc.calc(3, 9, "-")
        );

        // Subtraindo zero
        assertIgual(
            "Subtração de zero (5 - 0)",
            5.0,
            calc.calc(5, 0, "-")
        );

        System.out.println();
    }

    // =========================================================
    // TESTES DE MULTIPLICAÇÃO
    // =========================================================

    /**
     * Executa os testes relacionados à operação de multiplicação.
     *
     * <p>Cobre: positivos, negativo e multiplicação por zero.</p>
     */
    private static void testarMultiplicacao() {
        System.out.println("--- TESTE 3: MULTIPLICAÇÃO ---");

        // Dois positivos
        assertIgual(
            "Multiplicação de positivos (6 * 7)",
            42.0,
            calc.calc(6, 7, "*")
        );

        // Com negativo
        assertIgual(
            "Multiplicação com negativo (-3 * 4)",
            -12.0,
            calc.calc(-3, 4, "*")
        );

        // Por zero
        assertIgual(
            "Multiplicação por zero (9 * 0)",
            0.0,
            calc.calc(9, 0, "*")
        );

        System.out.println();
    }

    // =========================================================
    // TESTES DE DIVISÃO
    // =========================================================

    /**
     * Executa os testes relacionados à operação de divisão.
     *
     * <p>Cobre: divisão exata e divisão com resultado decimal.</p>
     */
    private static void testarDivisao() {
        System.out.println("--- TESTE 4: DIVISÃO ---");

        // Divisão exata
        assertIgual(
            "Divisão exata (10 / 2)",
            5.0,
            calc.calc(10, 2, "/")
        );

        // Divisão com resultado decimal
        assertIgual(
            "Divisão com decimal (7 / 2)",
            3.5,
            calc.calc(7, 2, "/")
        );

        System.out.println();
    }

    // =========================================================
    // TESTE DE DIVISÃO POR ZERO
    // =========================================================

    /**
     * Executa o teste de divisão por zero.
     *
     * <p>Verifica se o sistema retorna {@code Double.NaN} sem lançar exceção.</p>
     */
    private static void testarDivisaoPorZero() {
        System.out.println("--- TESTE 5: DIVISÃO POR ZERO ---");

        assertNaN(
            "Divisão por zero (10 / 0) deve retornar NaN",
            calc.calc(10, 0, "/")
        );

        System.out.println();
    }

    // =========================================================
    // TESTE DE OPERAÇÃO INVÁLIDA
    // =========================================================

    /**
     * Executa os testes para operações inválidas ou não reconhecidas.
     *
     * <p>Verifica se o sistema retorna {@code Double.NaN} sem lançar exceção.</p>
     */
    private static void testarOperacaoInvalida() {
        System.out.println("--- TESTE 6: OPERAÇÃO INVÁLIDA ---");

        // Operador desconhecido
        assertNaN(
            "Operador '%' inválido deve retornar NaN",
            calc.calc(10, 5, "%")
        );

        // String sem sentido
        assertNaN(
            "Operador 'abc' inválido deve retornar NaN",
            calc.calc(10, 5, "abc")
        );

        // Operação nula
        assertNaN(
            "Operador null deve retornar NaN",
            calc.calc(10, 5, null)
        );

        System.out.println();
    }

    // =========================================================
    // MÉTODOS AUXILIARES DE ASSERÇÃO
    // =========================================================

    /**
     * Verifica se o resultado obtido é igual ao resultado esperado (com tolerância).
     *
     * @param descricao   Descrição do caso de teste
     * @param esperado    Valor numérico esperado
     * @param obtido      Valor numérico retornado pela calculadora
     */
    private static void assertIgual(String descricao, double esperado, double obtido) {
        totalTestes++;
        boolean passou = Math.abs(esperado - obtido) < 0.0001;

        System.out.printf("  [%s] %s%n", passou ? "✓ PASSOU" : "✗ FALHOU", descricao);
        System.out.printf("       Esperado: %.4f | Obtido: %.4f%n", esperado, obtido);

        if (passou) {
            testesPassados++;
        } else {
            testesFalhados++;
        }
    }

    /**
     * Verifica se o resultado obtido é {@code Double.NaN} (Not a Number).
     *
     * <p>Usado para validar situações de erro como divisão por zero
     * ou operações inválidas.</p>
     *
     * @param descricao Descrição do caso de teste
     * @param obtido    Valor retornado pela calculadora (deve ser NaN)
     */
    private static void assertNaN(String descricao, double obtido) {
        totalTestes++;
        boolean passou = Double.isNaN(obtido);

        System.out.printf("  [%s] %s%n", passou ? "✓ PASSOU" : "✗ FALHOU", descricao);
        System.out.printf("       Esperado: NaN | Obtido: %s%n", Double.isNaN(obtido) ? "NaN" : obtido);

        if (passou) {
            testesPassados++;
        } else {
            testesFalhados++;
        }
    }

    /**
     * Exibe o resumo final com o total de testes executados,
     * aprovados e reprovados.
     */
    private static void exibirResumo() {
        System.out.println("============================================================");
        System.out.println("     RESUMO DOS TESTES");
        System.out.println("============================================================");
        System.out.printf("  Total executados : %d%n", totalTestes);
        System.out.printf("  ✓ Passou         : %d%n", testesPassados);
        System.out.printf("  ✗ Falhou         : %d%n", testesFalhados);
        System.out.println("============================================================");

        if (testesFalhados == 0) {
            System.out.println("  ★ Todos os testes passaram com sucesso!");
        } else {
            System.out.println("  ⚠ Atenção: existem testes com falha.");
        }

        System.out.println("============================================================");
    }
}
