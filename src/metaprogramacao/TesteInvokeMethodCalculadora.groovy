package metaprogramacao

/*Calculadora.metaClass.invokeMethod = { String name, args ->
    def method = delegate.metaClass.getMetaMethod(name, args)

    return 2 * method.invoke(delegate, args)
}

println new Calculadora().soma(2, 3)*/

Calculadora.metaClass.methodMissing  = { String name, args ->
    "Não conheço este método $name"
}

println new Calculadora().subtracaoT(3,4)

Calculadora.metaClass.propertyMissing = { String name ->
    "A propriedade $name não existe"
}

println new Calculadora().nome