package metaprogramacao

// É possível adicionar métodos a uma classe ou instância.

ClasseVazia.metaClass.nome = "Bruno"

def pessoa = new ClasseVazia()

println pessoa.getNome()

pessoa.nome = "João"

println pessoa.nome