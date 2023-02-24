def soma = { x, y ->
    x + y
}

def subtracao = { x, y ->
    x - y
}

def multiplicacao = { x, y ->
    x * y
}

def divisao = { x, y ->
    x / y
}

// Posso construir uma função que passa uma closure como parametro
def calculadora(closure, x, y) {
    closure(x, y)
}

//Também e possível escrever uma closure que recebe como argumento uma outra closure
/*
def calculadora = { closure, x, y ->
      closure x, y
}
*/

// É possível definir a chamada da closure sem definir parentes
println (calculadora soma, 10, 3)
println (calculadora subtracao, 10, 3)
println (calculadora multiplicacao, 10, 3)
println (calculadora divisao, 10, 3)