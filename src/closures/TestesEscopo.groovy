package closures

import closures.escopo.Animal
import closures.escopo.Pessoa

def pessoa = new Pessoa(nome: "Bruno")
def animal = new Animal(nome: "Cão")

animal.closure = pessoa.apresenteSe

animal.fale()