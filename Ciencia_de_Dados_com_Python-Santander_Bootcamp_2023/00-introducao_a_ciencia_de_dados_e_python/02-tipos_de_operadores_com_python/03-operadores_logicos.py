"""
  => São operadores utilizados em conjunto com os operadores de
  comparação, para montar uma expressão lógica.
  => Quando um operador de comparação é utilizado, o resultado retornado é um
  valor booleano, dessa forma podemos combinar operadores de comparação com
  os comparadores lógicos.
"""
print(f" True and True ==> {True and True}")
print(f" True and False ==> {True and False}")
print(f" False and False ==> {False and False}")
print(30 * "-")
print(f" True or True ==> {True or True}")
print(f" True or False ==> {True or False}")
print(f" False or False ==> {False or False}")
print(30 * "-")
print(f" not True ==> {not True}")
print(f" not False ==> {not False}")
print(30 * "-")

saldo, saque, limite = 1000, 500, 300

print(
    f"saldo >= saque| saldo é maior ou igual que saque? => {saldo >= saque}"
)  # saída: True

print(
    f"saldo <= limite| saldo é menor ou igual que limite? => {saldo <= limite}"
)  # saída: False

"""Operador lógico AND (e)"""
resposta = saldo >= saque and saque <= limite  # saída: False

# Lê-se saldo é maior ou igual que saque e saque é menor ou igual que limite?
# Para retornar True, as duas condições devem ser verdadeiras
# para retornar false, basta que uma das condições seja falsa
print(f"saldo >= saque and saque <= limite => {resposta}")

"""Operador lógico OR (ou)"""
resposta = saldo >= saque or saque <= limite  # saída: True

# Lê-se saldo é maior ou igual que saque ou saque é menor ou igual que limite?
# Para que a expressão seja verdadeira, basta que uma das condições
# seja verdadeira
# para retornar false, as duas condições devem ser falsas
print(f"saldo >= saque or saque <= limite => {resposta}")

"""Operator lógico de negação NOT (não)"""
# lê-se: 1000 é maior que 1500 ? false; e nega o resultado
# ou seja, retorna o contrário

resposta = not 1000 > 1500  # saída: True
print(f"not 1000 > 1500 => {resposta}")

contatos = []  # lista vazia é considerada False
# lê-se: contatos é True? false; e nega o resultado
print(f"not contatos => {not contatos}")  # saída: True

string = "saque 1500;"  # string não vazia é considerada True
# lê-se: string está preenchida? True (verdade); e nega o resultado
print(f"not string preenchida => {not string}")  # saída: False

string = ""  # string vazia é considerada False
# lê-se: string está vazia? false; e nega o resultado
print(f"not string vazia => {not string}")  # saída: True

# uma sequência vazia é considerada False em python

"""parênteses, not, and, or"""

saldo, saque, limite, conta_especial = 1000, 500, 300, True

r = saldo >= saque and saque <= limite or conta_especial and saldo >= saque
print(f" => {r}")

# com parênteses fica mais legível
r = (saldo >= saque and saque <= limite) or (conta_especial and saldo >= saque)
print(f" => {r}")

# boas práticas, quebrar a expressão em partes deixa o código mais legível
conta_normal_com_saldo_suficiente = saldo >= saque and saque <= limite
conta_especial_com_saldo_suficiente = conta_especial and saldo >= saque

exp = conta_normal_com_saldo_suficiente or conta_especial_com_saldo_suficiente
print(exp)
