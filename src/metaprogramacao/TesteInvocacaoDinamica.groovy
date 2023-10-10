package metaprogramacao

static def executeCalculo(String nomeOperacao, x, y) {
// Repare como executo o método pelo nome
    new Calculadora()."$nomeOperacao"(x,y)
}

/* Cosigo fazer chamadas de métodos dinamicamente, passando para o método o nome,
  e os parametros, assim conseguindo chamar o método da classe instanciada.
*/
println executeCalculo("divisao", 3, 4)
