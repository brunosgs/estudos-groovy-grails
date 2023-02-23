// O métodos getters e setters são criados automaticamente pelo Groovy
Pessoa pessoa = new Pessoa()
pessoa.setNome("Bruno")

// OBS > é possivel acessar os atributos da classe tanto pelo getter como pelo próprio atributo.
println pessoa.getNome()
println pessoa.nome

// Construtores dinamicos
Pessoa pessoa2 = new Pessoa(nome: "Pedro", sobreNome: "da Silva", ativa: true)
println "$pessoa2.nome $pessoa2.sobreNome esta com situação $pessoa2.ativa"

println pessoa2.@nome // Com o '@' acessa diretamente o atributo presente na classe.