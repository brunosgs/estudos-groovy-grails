package metaprogramacao

/*
    Incluído um comportamento novo para o método digaOi de uma instância de Pessoa específica, sem alterar o
    comportamento do mesmo método das outras instâncias de Pessoa.
*/
def pessoa = new Pessoa(nome: "Pedro")
pessoa.digaOi()

def novaPessoa = new Pessoa(nome: "Roberto")

novaPessoa.metaClass.digaOi = {
    println "Fui alterado... $novaPessoa.nome"
}

novaPessoa.digaOi()
pessoa.digaOi()