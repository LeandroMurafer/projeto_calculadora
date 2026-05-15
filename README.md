# projeto_calculadora

# FinançApp — Calculadora

Projeto desenvolvido como parte da disciplina de Qualidade de Software, simulando o módulo de cálculos matemáticos básicos do aplicativo **FinançApp** — uma startup fictícia de controle de finanças pessoais.

---

## Descrição do Projeto

Este projeto implementa uma **calculadora em Java** capaz de realizar operações matemáticas básicas (soma, subtração, multiplicação e divisão), seguindo boas práticas de desenvolvimento de software:

-  Testes unitários
-  Tratamento de erros
-  Documentação JavaDoc
   Refatoração de código
- Versionamento com Git

-

## Objetivo da Atividade

Desenvolver um projeto Java aplicando conceitos de qualidade de software, incluindo:

- Testes funcionais e unitários
- Tratamento de erros e exceções
- Refatoração de código
- Documentação técnica com JavaDoc
- Versionamento com Git e GitHub

---

## Tecnologias Utilizadas

| Tecnologia | Versão |
| Java (OpenJDK) | 21 |
| JavaDoc | (incluso no JDK) |
| Git | 2.x |
| GitHub | — |

---

## Operações Suportadas

| Operador | Operação | Exemplo | Resultado |

`+` | Soma | `calc(10, 5, "+")` | `15.0` |
`-` | Subtração | `calc(10, 5, "-")` | `5.0` |
 `*` | Multiplicação | `calc(6, 7, "*")` | `42.0` |
 `/` | Divisão | `calc(10, 2, "/")` | `5.0` |
 `/` (÷0) | Divisão por zero | `calc(10, 0, "/")` | `NaN` + mensagem de erro |
 Inválido | Operação inválida | `calc(10, 5, "%")` | `NaN` + mensagem de erro |

---

## Estrutura do Projeto

```
projeto_calculadora/
 src
  calculadora
      Calculadora.java         Classe principal (v1.0)
       TesteCalculadora.java    Testes unitários
docs
index.html          # Documentação JavaDoc gerada
README.md


> **Branch `Refatoracao`**: contém a versão refatorada da `Calculadora.java` com extração de métodos, validações separadas e constantes nomeadas.

---

## Como Executar

### Compilar

```bash
javac -d out src/calculadora/Calculadora.java src/calculadora/TesteCalculadora.java
```

### Executar a calculadora

```bash
java -cp out calculadora.Calculadora
```

### Executar os testes

```bash
java -cp out calculadora.TesteCalculadora
```

### Gerar documentação JavaDoc

```bash
javadoc -d docs -sourcepath src -subpackages calculadora
```

---

## Testes Unitários

Os testes estão implementados na classe `TesteCalculadora.java` e cobrem:

| Teste | Entrada | Esperado | Resultado |
|---|---|---|---|
| Soma positivos | `10 + 5` | `15.0` | `✓ PASSOU` |
| Soma com negativo | `-3 + 8` | `5.0` | `✓ PASSOU` |
| Soma com zero | `7 + 0` | `7.0` | `✓ PASSOU` |
| Subtração positiva | `10 - 4` | `6.0` | `✓ PASSOU` |
| Subtração negativa | `3 - 9` | `-6.0` | `✓ PASSOU` |
| Subtração de zero | `5 - 0` | `5.0` | `✓ PASSOU` |
| Multiplicação positivos | `6 * 7` | `42.0` | `✓ PASSOU` |
| Multiplicação negativo | `-3 * 4` | `-12.0` | `✓ PASSOU` |
| Multiplicação por zero | `9 * 0` | `0.0` | `✓ PASSOU` |
| Divisão exata | `10 / 2` | `5.0` | `✓ PASSOU` |
| Divisão decimal | `7 / 2` | `3.5` | `✓ PASSOU` |
| Divisão por zero | `10 / 0` | `NaN` | `✓ PASSOU` |
| Operador inválido `%` | `10 % 5` | `NaN` | `✓ PASSOU` |
| Operador inválido `abc` | `abc` | `NaN` | `✓ PASSOU` |
| Operador `null` | `null` | `NaN` | `✓ PASSOU` |

### Saída dos testes (print da execução):

```
============================================================
     TESTES UNITÁRIOS — FinançApp Calculadora
============================================================

--- TESTE 1: SOMA ---
  PASSOU Soma de positivos (10 + 5)
       Esperado: 15,0000 | Obtido: 15,0000
  PASSOU Soma com negativo (-3 + 8)
       Esperado: 5,0000 | Obtido: 5,0000
  PASSOU Soma com zero (7 + 0)
       Esperado: 7,0000 | Obtido: 7,0000

--- TESTE 2: SUBTRAÇÃO ---
  PASSOU Subtração com resultado positivo (10 - 4)
       Esperado: 6,0000 | Obtido: 6,0000
  PASSOU Subtração com resultado negativo (3 - 9)
       Esperado: -6,0000 | Obtido: -6,0000
  PASSOU Subtração de zero (5 - 0)
       Esperado: 5,0000 | Obtido: 5,0000

--- TESTE 3: MULTIPLICAÇÃO ---
  PASSOU Multiplicação de positivos (6 * 7)
       Esperado: 42,0000 | Obtido: 42,0000
   PASSOU Multiplicação com negativo (-3 * 4)
       Esperado: -12,0000 | Obtido: -12,0000
   PASSOU Multiplicação por zero (9 * 0)
       Esperado: 0,0000 | Obtido: 0,0000

--- TESTE 4: DIVISÃO ---
  PASSOU Divisão exata (10 / 2)
       Esperado: 5,0000 | Obtido: 5,0000
   PASSOU Divisão com decimal (7 / 2)
       Esperado: 3,5000 | Obtido: 3,5000

--- TESTE 5: DIVISÃO POR ZERO ---
Erro: divisão por zero não é permitida.
   PASSOU Divisão por zero (10 / 0) deve retornar NaN
       Esperado: NaN | Obtido: NaN

--- TESTE 6: OPERAÇÃO INVÁLIDA ---
Erro: operação '%' não reconhecida. Use +, -, * ou /.
   PASSOU Operador '%' inválido deve retornar NaN
       Esperado: NaN | Obtido: NaN
Erro: operação 'abc' não reconhecida. Use +, -, * ou /.
  PASSOU Operador 'abc' inválido deve retornar NaN
       Esperado: NaN | Obtido: NaN
Erro: operação inválida. Use +, -, * ou /.
   PASSOU Operador null deve retornar NaN
       Esperado: NaN | Obtido: NaN

============================================================
     RESUMO DOS TESTES
============================================================
  Total executados : 15
   Passou         : 15
   Falhou         : 0
============================================================
  Todos os testes passaram com sucesso!
============================================================
```

---

## Refatoração

A branch `Refatoracao` aplica as seguintes melhorias ao código:

| Técnica | Descrição |
|---|---|
| Extração de métodos | Validações e mensagens de erro movidas para métodos próprios |
| Constantes nomeadas | Operadores definidos como `static final String` |
| Nomes descritivos | Variáveis e métodos com nomes auto-explicativos |
| Separação de responsabilidades | Validação, operação e exibição de erros desacoplados |
| Organização lógica | Código agrupado por seções com comentários de seção |

---

## Documentação JavaDoc

A documentação HTML é gerada com o comando:

```bash
javadoc -d docs -sourcepath src -subpackages calculadora
```

O arquivo principal está em `docs/index.html`.

---

## Commits Sugeridos

```
feat: cria estrutura inicial do projeto
feat: implementa classe Calculadora com operações básicas
feat: implementa testes unitários em TesteCalculadora
fix: adiciona tratamento para divisão por zero e operações inválidas
docs: adiciona JavaDoc em todas as classes e métodos
refactor: extrai métodos de validação e mensagem de erro
refactor: adiciona constantes para operadores
docs: gera documentação JavaDoc em /docs
docs: adiciona README completo
```

---

## Link do Repositório

> [https://github.com/Leandromurafer/projeto_calculadora](https://github.com/Leandromurafer/projeto_calculadora)

