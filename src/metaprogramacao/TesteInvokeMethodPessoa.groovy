package metaprogramacao

Pessoa.metaClass.invokeMethod = { String name, args ->
    println "Vou chama $name"

    def metodo = delegate.metaClass.getMetaMethod(name, args)

    metodo.invoke(delegate, args)

    println "Chamei o método"
}

def pessoa = new Pessoa(nome: "Teste Bruno")
pessoa.imprima()