package closures.escopo

def pessoa = new Pessoa(nome: "Bruno")
def animal = new Animal(nome: "Cão")

animal.closure = pessoa.apresenteSe

animal.fale()