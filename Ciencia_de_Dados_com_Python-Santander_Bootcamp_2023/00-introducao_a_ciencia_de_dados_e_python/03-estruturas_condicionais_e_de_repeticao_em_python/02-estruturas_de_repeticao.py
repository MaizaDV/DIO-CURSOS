"""
Estruturas de repetição
=> São estruturas utilizadas para repetir um trecho de código um determinado
número de vezes. Esse número pode ser conhecido previamente ou determinado
através de uma expressão lógica.
"""

# ^ Exemplo sem repetição
# a = int(input("Informe um número inteiro: "))
a = 0
print(a)

a += 1
print(a)

a += 1
print(a)

"""
for
=> O comando for é usado para percorrer um objeto iterável. Faz sentido usar
for quando sabemos o número exato de vezes que nosso bloco de código deve ser
executado, ou quando queremos percorrer um objeto iterável.

Sintaxe:
for <item que está sendo iterádo> in <objeto iterável>:
    <bloco de código>
"""

# texto = input("Informe um texto: ")
texto = "Python"
VOGAIS = "AEIOU"

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")


print()  # adiciona uma quebra de linha

"""for/else"""
texto = "Python"
VOGAIS = "AEIOU"

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
else:
    print()
    print("Executa no final do laço")

"""
Função range
=> É uma função built-in do python, ela é usada para produzir uma sequência de
números inteiros a partir de um ínicio(inclusivo) para um fim (exclusivo).
Se usarmos range(i, j) será produzido: i, i+1, i+2, i+3, ..., j-1.
Ela recebe 3 argumentos: stop(obrigatório), start(opcional) e step(opcional).
"""
# range(stop) -> range object
# range(start, stop[, step]) -> range object
# print("list(range(4)) => ", list(range(4)))  # [0, 1, 2, 3]

for numero in range(0, 4):
    print(numero, end=" ")
print()


# ^ exibindo a tabuada do 5
for numero in range(0, 51, 5):
    print(numero, end=" ")
print()

"""
while
=> É usado para repetir um bloco de código várias vezes. Faz sentido usar
while quando não sabemos o número exato de vezes que nosso bloco de código
deve ser executado.
"""

opcao = -1

# ele executa enquanto a condição for verdadeira/atendida
# while opcao != 0:
#     opcao = int(input("[1] Sacar \n[2] Extrato \n[0] Sair \n: "))
#     if opcao == 1:
#         print("Sacando...")
#     elif opcao == 2:
#         print("Exibindo o extrato...")

"""while/else"""
# ele executa enquanto a condição for verdadeira/atendida
while opcao != 0:
    opcao = int(input("[1] Sacar \n[2] Extrato \n[0] Sair \n: "))
    if opcao == 1:
        print("Sacando...")
    elif opcao == 2:
        print("Exibindo o extrato...")
else:
    print("Saindo do sistema...")

"""break"""
# break interrompe a execução do laço de repetição
while True:
    numero = int(input("Informe um número: "))
# interrompe a execução do laço de repetição ao escolher 10
    if numero == 10:
        break

    if numero % 2 == 0:
        continue

    print(numero)


# continue usado para pular uma iteração específica dentro do laço de repetição
# for numero in range(100):
# pula a iteração quando o número for par
#     if numero % 2 == 0:
#         continue

#     print(numero, end=" ")

# ^ dica, tentar usar o break antes do continue em uma estrutura de repetição
