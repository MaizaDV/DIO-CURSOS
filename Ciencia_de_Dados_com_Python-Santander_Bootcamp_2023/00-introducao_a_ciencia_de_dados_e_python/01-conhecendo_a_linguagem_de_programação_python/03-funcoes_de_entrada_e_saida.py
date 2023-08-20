"""Funções de entrada e saída"""

"""Função input()"""
# A função builtin input() é utilizada para receber dados de entrada
# do usuário.
# Ela recebe um argumento do tipo string, que é exibido na tela para
# o usuário.
# O valor digitado pelo usuário é retornado pela função.

# basta descomentar o código abaixo para testar
# nome = input("Digite seu nome: ")
# print(f"Olá {nome}!")


"""Função print()"""
# A função builtin print() é utilizada para exibir dados na tela.
# Ela recebe um valor obrigatório do tipo varargs de objetos e
# 4 argumentos opcionais: sep, end, file e flush.
# Todos os objetos passados como argumento são convertidos para string,
# separados pelo valor do argumento sep e terminados por end.

nome, sobrenome = "Linus", "Torvalds"

print(f"Olá {nome} {sobrenome}!", sep="~~", end=";)\n")

print(nome, sobrenome, sep="~~")
print(nome, sobrenome, end="!!:) \n")

"""links úteis"""
# https://docs.python.org/3/library/functions.html#input
# https://docs.python.org/3/library/functions.html#print
