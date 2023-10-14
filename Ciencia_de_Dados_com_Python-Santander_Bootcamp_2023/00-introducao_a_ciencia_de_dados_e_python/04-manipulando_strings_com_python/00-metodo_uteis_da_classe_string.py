"Manipulando Strings com Python"

print(50 * "-")

curso = "PyThon"
print("curso => ", curso)

# ^ String para maiúsculo
print("curso.upper() => ", curso.upper())  # PYTHON

# ^ String para minúsculo
print("curso.lower() => ", curso.lower())  # python

# ^ Primeira letra da string para maiúsculo
print("curso.capitalize() => ", curso.capitalize())  # Python
print("curso.title() => ", curso.title())  # Python

print(50 * "-")

# & Eliminando espaços em branco

curso = "    Python    "
print(f"curso => '{curso}'")

# ^ Eliminando espaços em branco à esquerda e à direita
print(f"curso.strip() => '{curso.strip()}'")  # Python

# ^ Eliminando espaços em branco à esquerda
print(f"curso.lstrip() => '{curso.lstrip()}'")  # Python

# ^ Eliminando espaços em branco à direita
print(f"curso.rstrip() => '{curso.rstrip()}'")

print(50 * "-")

# & Centralização e junções de string

curso = "Python"
print(f"curso => '{curso}'")

# ^ Centralizando a string
print(f"curso.center(20, '*') => '{curso.center(20, '*')}'")

# ^ juntando a string
print(f"curso.join('**') => '{curso.join('****')}'")
print(f"'.'.join(curso) => '{'.'.join(curso)}'")
