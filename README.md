# Enums, threads, strings and numbers

This repository is based on Loiane Groner's Java Intermediate course. It is part of a series of studies in Java.

### Exercises

**Enum exercise - Calculadora com Enum**

- Escreva um Enum que represente as quatro operações matemáticas: somar, subtrair, multiplicar e dividir
- O Enum deve ter um construtor que receba o símbolo da operação (+, - , * , / )
- Sobrescreva o método toString que retorne somente o símbolo da operação
- Implemente um método abstrato com a seguinte assinatura **double executarOperacao(double x, double y)**. Cada opção do Enum deve implementar esse método realizando a operação de acordo com sua descrição.
- Escreva um método main para teste que realize todas as operações do Enum. Dica: você pode usar o método **values** para iterar o Enum e executar todas as operações.

**Threads exercise - Semáforo**

- Crie um semáforo (sinal de trânsito) usando Threads. O semáforo deve ficar verde por x segundos, depois brevemente amarelo seguido de y segundos na cor vermelha.