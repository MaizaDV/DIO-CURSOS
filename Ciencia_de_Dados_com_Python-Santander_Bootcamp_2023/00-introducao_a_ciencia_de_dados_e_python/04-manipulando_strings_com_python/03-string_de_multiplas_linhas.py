"""
String de múltiplas linhas ou strings triplas
=> São definidas informando 3 aspas simples ou duplas durante a atribuição.
Elas podem ocupar várias linhas do código, e todos os espaços em branco são
incluídos na string final.
"""

nome = "Linus Torvalds"

mensagem = f"""
Olá, meu nome é {nome}!
"""

print(mensagem)


print(
    """
    ============= MENU =============

    1 - Depositar
    2 - Sacar
    0 - Sair

    ================================

            Obrigado por usar nosso sistema!!!!
"""
)
