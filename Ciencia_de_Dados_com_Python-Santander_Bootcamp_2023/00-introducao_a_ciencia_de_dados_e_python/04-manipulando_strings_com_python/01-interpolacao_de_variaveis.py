"""
Interpolação de variáveis
=> Em Python temos 3 formas de interpolar variáveis em strings, a primeira é
usando o sinal %, a segunda é usando o método format() e a terceira é
utilizando f strings.
A primeira forma não é atualmente recomendada e seu uso em Python3 é raro.
A partir do Python 3.6, a forma mais recomendada é utilizar f strings.
"""

nome, idade = "Linus", 28
profissao, linguagem = "Programador", "Python"

# & Old style %

print(
    "Nome: %s, Idade: %d, Profissão: %s, Linguagem: %s"
    % (nome, idade, profissao, linguagem)
)

# & Método format()
print(
    "Nome: {}, Idade: {}, Profissão: {}, Linguagem: {}".format(
        nome, idade, profissao, linguagem
    )
)

print(
    "Profissão: {2}, Nome: {0}, Idade: {1}, Linguagem: {3}".format(
        nome, idade, profissao, linguagem
    )
)

# mais legível, vantagens de repetir variáveis se necessário
print(
    "Nome: {n}{n}{n}, Idade: {i}, Profissão: {p}, Linguagem: {l}".format(
        n=nome, i=idade, p=profissao, l=linguagem
    )
)

# usando dicionário
dict = {"n": nome, "i": idade, "p": profissao, "l": linguagem}
print("Nome: {n}, Idade: {i}, Profissão: {p}, Linguagem: {l}".format(**dict))

# & f-strings
print(f"Nome: {nome}, Idade: {idade}, Profissão: {profissao}")

# formatar strings com f-strings
PI = 3.141592653589793
print(f"Valor de PI: {PI:.2f}")

print(f"Valor de PI: {PI:10.2f}")
