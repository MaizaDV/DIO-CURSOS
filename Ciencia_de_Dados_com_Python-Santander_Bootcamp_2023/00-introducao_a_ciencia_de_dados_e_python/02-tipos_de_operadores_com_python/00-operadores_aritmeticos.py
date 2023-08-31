"""Operações aritméticas""" ""
a, b, c = 10, 5, 2

# adição
print("adição =>", a + b)  # saída: 15

# subtração
print("subtração =>", a - b)  # saída: 5

# multiplicação
print("multiplicação =>", a * b)  # saída: 50

# divisão retorna um número de ponto flutuante(float)
print("divisão =>", a / b)  # saída: 2.0

# divisão inteira
print("divisão inteira =>", a // b)  # saída: 2

# módulo, resto da divisão
print("módulo =>", a % b)  # saída: 0

# exponenciação, ao cubo
print("exponenciação =>", a**b)  # saída: 100000

"""Precedência de operadores"""
# Na matemática existe uma regra que indica quais operações devem ser
# executadas primeiro.Isso é util pois ao analisar uma expressão, a depender da
# ordem das operações, o valor pode ser diferente.
# A definição de precedência de operadores em Python é a mesma da matemática.

# A ordem de precedência é a seguinte:
# 1°. Parênteses;
# 2°. Expoêntes;
# 3°. Multiplicações e divisões (da esquerda para a direita);
# 4°. Adições e subtrações (da esquerda para a direita).

# sem ordem de precedência
print("sem ordem de precedência =>", a - b * c)  # saída: 0

# com ordem de precedência
print("com 1° ordem de precedência =>", (a - b) * c)
print("com 2° ordem de precedência =>", a**c * c)
print("com 1 e 2° ordem de precedência =>", a ** (c * c))
print("ordem da esquerda para a direita =>", a / b * c)
