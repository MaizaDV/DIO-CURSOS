"""
  Indentação
  => Identar código é uma forma de manter o código fonte mais legível e
  manutenível. Mas em python ela exerce um segundo papel, através da identação
  o interpretador consegue determinar onde um bloco de comando inicia e onde
  ele termina.
"""

"""
  Blocos
=> Existe uma convenção em python, que define as boas práticas para escrita de
código na linguagem. Essa convenção é chamada de PEP8, nesse documento é
indicado utilizar 4 espaços em branco por nível de identação, ou seja, a cada
novo bloco adicionamos 4 novos espaços em branco.
"""


def sacar(self, valor: float) -> None:  # início do bloco do método
    if self.saldo >= valor:  # início do bloco do if
        self.saldo -= valor
    # fim do bloco do if


# fim do bloco do método

"""
Isto não funciona em python, pois o interpretador não consegue identificar onde
o bloco do método termina e onde o bloco do if inicia.
def sacar(self, valor: float) -> None:  # início do bloco do método
if self.saldo >= valor:  # início do bloco do if
self.saldo -= valor
# fim do bloco do if
# fim do bloco do método
"""

print(50 * "-")


def sacar2(valor):
    print("estou dentro do bloco do método")
    saldo = 500

    if saldo >= valor:
        print("valor sacado!")
        print("estou no bloco do if")

    print("Obrigado por ser nosso cliente, tenha um bom dia!")
    print("estou fora do bloco do if")


print("estou fora do bloco do método")
print(20 * "->")


def depositar(valor):
    saldo = 500
    saldo += valor
    print("Obrigado por depositar, tenha um bom dia!")


sacar2(200)

print(20 * "->")

sacar2(1000)

print(50 * "-")

depositar(1000)

print(20 * "->")
