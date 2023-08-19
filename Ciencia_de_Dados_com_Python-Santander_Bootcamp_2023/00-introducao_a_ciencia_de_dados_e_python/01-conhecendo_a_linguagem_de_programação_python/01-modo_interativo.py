import math
# modo_interativo

# O interpretador Python pode executar comandos diretamente
# no modo interativo, sem a necessidade de criar um arquivo de código-fonte.
# Para iniciar, basta digitar 'python'(em alguns sistemas pode ser 'python3')
# no terminal e pressionar Enter.

# Ou para executar somente arquivos .py,
# digite 'python caminho/nome_do_arquivo.py' ou
# 'python -i caminho/nome_do_arquivo.py'.

# O prompt do interpretador será exibido, indicando que o interpretador
# está pronto para receber comandos.


print("\n DIR() ==> Retorna uma lista de argumentos válidos")
print(">────────────────────────────────────────────────────────────────────<")
"""Mostra o que tem no escopo local"""
# ao importar o módulo 'math', o interpretador Python
# cria uma variável chamada 'math' no escopo local
print(dir())
print(">────────────────────────────────────────────────────────────────────<")

"""Mostra os métodos e atributos do módulo 'math'"""
print("\n Métodos do math ==> ", dir(math))
print(">────────────────────────────────────────────────────────────────────<")

"""Mostra os métodos e atributos do int 100"""
print("\n Métodos do int 100 ==> ", dir(100))
print(">────────────────────────────────────────────────────────────────────<")

print("\n HELP() ==> Mostra a documentação de um método ou atributo")
print(">────────────────────────────────────────────────────────────────────<")

"""Entra no modo interativo do help()"""
print(help())
# ao entrar no modo interativo do help(), digite o nome do método ou atributo
# que deseja consultar a documentação e pressione Enter.
# Para sair, digite 'quit' ou 'q' e pressione Enter.
