"""
Fatiamento de strings
=> É uma técnica utilizada para retornar substrings(partes da string original),
informando inicio(start), fim(stop) e passo(step):[start:stop[,step]].
"""

nome = "Linus Torvalds"

# pega o indice: 0
r = nome[0]  # L
print(f"nome[0] => '{r}'")

# pega o antepenúltimo
r = nome[-2]  # d
print(f"nome[-2] => '{r}'")

# : lê desde o início(:) até o index 3, mas não inclui o index 3
r = nome[:3]  # Lin
print(f"nome[:3] => '{r}'")

# : lê desde o (início)index 7 até o final(:)
r = nome[7:]  # orvalds
print(f"nome[7:] => '{r}'")

# : lê desde o (início)index 7 até o index 12(fim), mas não inclui o index 12
r = nome[7:12]  # orval
print(f"nome[7:12] => '{r}'")

# : lê desde o (início)index 7 até o index 12(fim), pulando de 2 em 2
r = nome[7:14:2]  # ovls
print(f"nome[7:14:2] => '{r}'")

# retorna a string inteira
r = nome[:]  # Linus Torvalds
print(f"nome[:] => '{r}'")

# retorna a string inteira
r = nome[::]  # Linus Torvalds
print(f"nome[::] => '{r}'")

# retorna a string inteira, pulando de 2 em 2
r = nome[::2]  # LusTrvls
print(f"nome[::2] => '{r}'")

# retorna a string invertida
r = nome[::-1]  # sdlavroT suniL
print(f"nome[::-1] => '{r}'")
