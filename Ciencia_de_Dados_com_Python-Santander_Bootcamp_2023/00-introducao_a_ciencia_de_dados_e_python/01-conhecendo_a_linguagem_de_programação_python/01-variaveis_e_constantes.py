"""Variáveis e Constantes"""
# --> Variáveis
# Variáveis são espaços na memória do computador
# que armazenam valores temporários e mutáveis.
nome = "Maizadv"
idade = 22
print('Variáveis => ', nome, idade)

# multiple assignment (atribuição múltipla)
nome, idade = "Maiza", 23

print('Variáveis => ', nome, idade)
# --> Constantes
# Constantes são espaços na memória do computador que armazenam
# valores fixos e imutáveis.

# --> Em Python não existe o conceito de constante, mas por convenção,
# variáveis que armazenam valores fixos são escritas em letras maiúsculas.
"""Constantes em Python"""
ABS_PATH = "/home/usuario/Documentos/arquivo.txt"
DEBUG = True
BRAZILIAN_STATES = [
    "SP",
    "RJ",
    "MG",
]
AMOUNT = 30.25

print('Constantes => ', ABS_PATH, DEBUG, BRAZILIAN_STATES, AMOUNT)

"""Boas práticas"""
# 1. O padrão de nomenclatura de variáveis e constantes
# em Python é o snake_case
# 2. Escolha nomes sugestivos para as variáveis e constantes
# 3. Nomes de Constantes devem ser escritos em letras maiúsculas
