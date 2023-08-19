"""Conversão de tipos"""

print(">────────────────────────────────────────────────────────────────────<")
"""int para float"""
print("int para float =>")

preco = 10
print(f"= Valor inicial = \n TYPE: {type(preco)}, Valor: {preco}")

preco = float(preco)
print(f"= Valor convertido = \n TYPE: {type(preco)}, Valor: {preco}")

print(">────────────────────────────────────────────────────────────────────<")
"""int para float usando divisão"""
print("int para float usando divisão =>")

preco1 = 10
print(f"= Valor inicial = \n TYPE: {type(preco1)}, Valor: {preco1}")

preco1 = preco1 / 2
print(f"= Valor convertido = \n TYPE: {type(preco1)}, Valor: {preco1}")
print(">────────────────────────────────────────────────────────────────────<")

"""float para int"""
print("float para int =>")

preco2 = 10.5
print(f"= Valor inicial = \n TYPE: {type(preco2)}, Valor: {preco2}")

preco2 = int(preco2)
print(f"= Valor convertido = \n TYPE: {type(preco2)}, Valor: {preco2}")
print(">────────────────────────────────────────────────────────────────────<")

"""Conversão por divisão"""
print("Conversão por divisão =>")

preco3 = preco4 = 10
print(f"= Valor inicial = \n TYPE: {type(preco3)}, Valor: {preco3}")

preco3 = preco3 / 2
print(f"= Valor convertido float = \n TYPE: {type(preco3)},Valor: {preco3}")

preco4 = preco4 // 2
print(f"= Valor convertido int = \n TYPE: {type(preco4)}, Valor: {preco4}")
print(">────────────────────────────────────────────────────────────────────<")

"""Numérico para String"""
print("Numérico para String =>")

preco5, idade = 10.50, 28
print("= Valor inicial =")
print(f" TYPE: preco5= {type(preco5)}, idade= {type(preco5)}")
print(f" Valor: preco5= {preco5}, idade= {idade}")

preco5, idade = str(preco5), str(idade)
print("= Valor convertido =")
print(f" TYPE: preco5= {type(preco5)}, idade= {type(preco5)}")
print(f" Valor: preco5= {preco5}, idade= {idade}")

texto = f"idade {idade} preço {preco5}"
print(f"= Concatenando = \n {texto}")
print(">────────────────────────────────────────────────────────────────────<")

"""String para Numéro"""
print("String para Numéro =>")

preco6, idade1 = "10.50", "28"
print(f"= Valor inicial = \n TYPE: {type(preco6)}, Valor: {preco6}")
print(f"TYPE: {type(idade1)}, Valor: {idade1}")

preco6, idade1 = float(preco6), int(idade1)
print(f"= Valor convertido = \n TYPE: {type(preco6)}, Valor: {preco6}")
print(f"TYPE: {type(idade1)}, Valor: {idade1}")
print(">────────────────────────────────────────────────────────────────────<")

"""Erro de conversão"""
print("Erro de conversão =>")

preco = "Python"
print(f"= Valor inicial = \n TYPE: {type(preco)}, Valor: {preco}")

print(f"= Valor com erro= {float(preco)}")
# saída: ValueError: could not convert string to float: 'Python'
