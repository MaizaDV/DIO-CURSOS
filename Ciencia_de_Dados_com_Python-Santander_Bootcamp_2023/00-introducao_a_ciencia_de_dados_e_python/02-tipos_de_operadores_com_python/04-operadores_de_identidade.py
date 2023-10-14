"""
  Operadores de identidade
  => São operadores utilizados para comparar se os dois objetos testados
  ocupam a mesma posição na memória.
"""

curso = "Curso de Python"
nome_curso = curso
saldo, limite = 200, 200

print(35 * "-")

# lê-se:
# curso está na mesma posição de memória que nome_curso?
resposta = curso is nome_curso  # saída: True
print(f"curso is nome_curso => {resposta}")

print(35 * "-")

# lê-se:
# curso não está na mesma posição de memória que nome_curso?
resposta = curso is not nome_curso  # saída: False
print(f"curso is not nome_curso => {resposta}")

print(35 * "-")

# lê-se:
# saldo está na mesma posição de memória que limite?
resposta = saldo is limite  # saída: False
print(f"saldo is limite => {resposta}")

print(35 * "-")

# lê-se:
# saldo não está na mesma posição de memória que limite?
print(f"saldo is not limite => {saldo is not limite}")  # saída: True

print(35 * "-")
