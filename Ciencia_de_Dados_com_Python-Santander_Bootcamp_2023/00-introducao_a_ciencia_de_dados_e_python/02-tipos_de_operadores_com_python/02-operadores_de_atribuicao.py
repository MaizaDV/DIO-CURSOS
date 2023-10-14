"""
  => Operadores de atribuição
  São operadores utilizados para definir o valor inicial
  ou sobrescrever o valor de uma variável.
"""


"""Atribuição simples (=)"""
# lê-se: saldo recebe 1000
saldo = 1000
print(f"saldo => {saldo}")  # saída: 1000

"""Atribuição com adição (+=)"""
# lê-se: saldo recebe saldo + 500
saldo += 500
print(f"saldo => {saldo}")  # saída: 1500

"""Atribuição com subtração (-=)"""
# lê-se: saldo recebe saldo - 300
saldo -= 300
print(f"saldo => {saldo}")  # saída: 1200

"""Atribuição com multiplicação (*=)"""
# lê-se: saldo recebe saldo * 2
saldo *= 2
print(f"saldo => {saldo}")  # saída: 2400

"""Atribuição com divisão (/=)"""
# lê-se: saldo recebe saldo / 3
saldo /= 3
print(f"saldo => {saldo}")  # saída: 800.0

"""Atribuição com divisão inteira (//=)"""
# lê-se: saldo recebe saldo // 2
saldo = 1000
saldo //= 2
print(f"saldo => {saldo}")  # saída: 500

"""Atribuição com módulo (%=)"""
# lê-se: saldo recebe saldo % 48
saldo %= 48
print(f"saldo => {saldo}")  # saída: 20

"""Atribuição com exponenciação (**=)"""
# lê-se: saldo recebe saldo ** 2
saldo **= 2
print(f"saldo => {saldo}")  # saída: 400
