package metaprogramacao

/*
    O Groovy fornece recursos poderosos de metaprogramação que permitem que os desenvolvedores criem e personalizem
    comportamentos dinamicamente em tempo de execução. Por exemplo, é possível adicionar novos métodos ou propriedades
    a classes existentes em tempo de execução, substituir o comportamento de métodos existentes ou gerar código
    automaticamente.
*/

String.metaClass.entreCochetes = {
    "[ $delegate ]"
}

// Adicionando um novo método a classe String.
println "Groovy rocks".entreCochetes()