"""
  Operadores de associação
  => São operadores utilizados para verificar se um objeto está presente
  em uma sequência.
  -> not in: verifica se um objeto não está presente em uma sequência.
  -> in: verifica se um objeto está presente em uma sequência.
  -> ele é case sensitive, ou seja, diferencia letras maiúsculas de minúsculas.
"""

curso = "Curso de Python"  # sequência de caracteres
frutas = ["laranja", "uva", "limão", "morango"]  # lista
saques = [1500, 100]  # lista de tipos inteiros

print(35 * "-")

# lê-se: strint Python está presente em string de curso?
resposta = "Python" in curso  # saída: True
print(f"'Python' in curso => {resposta}")
resposta = "python" in curso  # saída: False
print(f"'python' in curso => {resposta} | case sensitive")  # saída: False

print(35 * "-")

# lê-se: string "maça" não está presente na lista de frutas?
resposta = "maça" not in frutas  # saída: True
print(f"'maça' not in frutas => {resposta}")
print(f"'uva' in frutas => {'uva' in frutas} | case sensitive")
print(f"'Uva' in frutas => {'Uva' in frutas} | case sensitive")

print(35 * "-")

# lê-se: 200 está presente na lista de saques?
resposta = 200 in saques  # saída: False
print(f"200 in saques => {resposta}")

print(35 * "-")
