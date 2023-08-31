"""
  => Operadores de comparação
  São operadores utilizaos para comparar valores.
  Eles retornam um valor booleano (True ou False)
"""

saldo, saque = 1000, 500

"""Comparação de igualdade (==)"""
print(f"saldo == saque | É igual? => {saldo == saque}")  # saída: False

"""Comparação de diferença (!=)"""
print(f"saldo != saque | É diferente? => {saldo != saque}")  # saída: True

"""Comparação de maior que (>) / maior ou igual (>=)"""
print(f"saldo > saque | saldo é maior que saque? => {saldo > saque}"
      )  # saída: True
print(
    f"saldo >= saque | saldo é maior ou igual que saque? => {saldo >= saque}"
)  # saída: True

"""Comparação de menor que (<) / menor ou igual (<=)"""
print(f"saldo < saque | saldo é menor que saque? => {saldo < saque}"
      )  # saída: False
print(
    f"saldo <= saque | saldo é menor ou igual que saque? => {saldo <= saque}"
)  # saída: False
