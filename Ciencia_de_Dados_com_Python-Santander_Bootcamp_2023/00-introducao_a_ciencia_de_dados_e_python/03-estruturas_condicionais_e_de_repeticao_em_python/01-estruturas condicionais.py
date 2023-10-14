import sys

"""
  Estruturas condicionais
=> A estrutura condicional permite o desvio de fluxo de controle, quando
determinadas expressões lógicas são atendidas.

if <expressão lógica>:
    <bloco de código>
elif <expressão lógica>:
    <bloco de código>
else:
    <bloco de código>
"""

"""
=> if: Para criar uma estrutura condicional simples, composta por um único
desvio, podemos utilizar a palavra reservada if. O comando irá testar a
expressão lógica e em caso de retorno verdadeiro as ações presentes no bloco
de código do if serão executadas.

Sintaxe:
if <expressão lógica>:
    <bloco de código>

"""
saldo = 2000.0
saque = float(input("Digite o valor do saque: "))

if saldo >= saque:
    saldo -= saque
    print("Saque realizado com sucesso!")
    print("Saldo atual: ", saldo)

if saldo < saque:
    print("Saldo insuficiente!")


"""
=> if-else: Para criar uma estrutura condicional com dois desvios, podemos
utiizar as palavras reservadas if e else.
Como sabemos se a expressão lógica testada no if for verdadeira, o bloco de
código do if será executado. Caso contrário o bloco de código do else será
executado.

Sintaxe:
if <expressão lógica>:
    <bloco de código>
else:
    <bloco de código>

"""
saldo = 2000.0
saque = float(input("Digite o valor do saque: "))

if saldo >= saque:
    saldo -= saque
    print("Saque realizado com sucesso!")
    print("Saldo atual: ", saldo)

else:
    print("Saldo insuficiente!")


"""
=> if/elif/else: Para criar uma estrutura condicional com três ou mais desvios,
podemos utilizar as palavras reservadas elif. O elif é composto por uma nova
expresão lógica, que será testada e caso retorne verdadeiro o bloco de código
do elif será executado.
Não existe um limite para a quantidade de elifs que
podemos utilizar, porém, evite criar grandes estruturas condicionais, pois
elas aumentam a complexidade do código.

Sintaxe:
if <expressão lógica>:
    <bloco de código>
elif <expressão lógica>:
    <bloco de código>
else:
    <bloco de código>

"""
opcao = int(input("Informe uma opção: [1] Sacar\n [2] Extrato: "))
if opcao == 1:
    print("Sacar")
elif opcao == 2:
    print("Exibindo o extrato...")
else:
    sys.exit("Opção inválida!")

print(50 * "-")

MAIOR_IDADE = 18
IDADE_ESPECIAL = 16

idade = int(input("Informe sua idade: "))

if idade >= MAIOR_IDADE:
    print("Maior idade, pode tirar a CNH!")
if idade < MAIOR_IDADE:
    print("Menor idade, não pode tirar a CNH!")

print(50 * "-")

if idade >= MAIOR_IDADE:
    print("Maior idade, pode tirar a CNH!")
else:
    print("Menor idade, não pode tirar a CNH!")

print(50 * "-")


if idade >= MAIOR_IDADE:
    print("Maior idade, pode tirar a CNH!")
elif idade == IDADE_ESPECIAL:
    print("Pode fazer aulas teóricas, mas não pode dirigir!")
else:
    print("Menor idade, não pode tirar a CNH!")

print(50 * "-")

"""
=> if aninhado
Podemos criar estruturas condicionais aninhadas, para isso basta adicionar
estruturas if/elif/else dentro do bloco de código de estruturas if/elif/else,
ou seja, estruturas condicionais dentro de outras estruturas condicionais.
"""
conta_normal = False
conta_universitaria = False
conta_especial = True

saldo = 2000
saque = 1500
cheque_especial = 450

msg = "Sistema não reconheceu seu tipo de conta"
msg2 = ", entre em contato com o seu gerente."

if conta_normal:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    elif saque <= (saldo + cheque_especial):
        print("Saque realizado com uso do cheque especial!")
    else:
        print("Não foi possivel realizar o saque, saldo insuficiente!")

elif conta_universitaria:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    else:
        print("Saldo insuficiente!")

elif conta_especial:
    print("Conta especial selecionada!")

else:
    print(msg + msg2)

"""
=> if ternário
Ele permite escrever uma condição em uma única linha. Ele é compostopor três
partes, a primeira parte é o retorno caso a expressão retorne verdadeiro, a
segunda parte é a expressão lógica e a terceira parte é o retorno caso a
expressão não seja atendida.
Sintaxe:
<retorno caso a expressão seja verdadeira> if <expressão lógica> else <retorno
caso a expressão não seja atendida>
"""
saldo = 2000
saque = 2500

status = "Sucesso" if saldo >= saque else "Falha"

print(f"{status} ao realizar o saque!")
