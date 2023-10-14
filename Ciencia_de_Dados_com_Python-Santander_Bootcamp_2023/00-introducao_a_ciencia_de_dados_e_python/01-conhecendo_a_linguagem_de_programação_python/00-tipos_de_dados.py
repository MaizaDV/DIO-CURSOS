"""Tipos em Python"""

print("tipos build-in:")
print("Texto => str \n TYPE", type("Texto"))
print(
    "Númerico => int, float, complex \n TYPE",
    type(10),
    type(10.0),
    type(10j)
)
print(
    "Sequência => list, tuple, range \n TYPE",
    type([1, 2, 3]),
    type((1, 2, 3)),
    type(range(0, 10)),
)
print("Mapa => dict \n TYPE", type({"nome": "João", "idade": 30}))
print(
    "Coleção => set, frozenset \n TYPE",
    type({1, 2, 3}),
    type(frozenset({1, 2, 3}))
)
print("Booleano => bool \n TYPE", type(True), type(False))
print(
    "Binário => bytes, bytearray, memoryview \n TYPE",
    type(b"Hello"),
    type(bytearray(5)),
    type(memoryview(bytes(5))),
)
