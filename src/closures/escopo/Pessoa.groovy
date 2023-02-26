package closures.escopo

class Pessoa {
    String nome

    def apresenteSe = {
        println "Olá. Meu nome é $nome e meu delegate ${delegate.nome}"
    }
}