/*
    - A closure é uma função;
    - Ela sempre tem um paramentro implícito chamado de 'it'. Mas é possível trocar o nome dele.
    - Pode adicionar uma tipagem estática pro atributo 'it'.
 */

def olaMundo = {
    println "Olá mundo!"
}

def duplique = {
    it * 2
}

// Alterando o nome do 'it' para 'valor'
def multiplique = { valor ->
    valor * 3
}

def multipliqueInteiros = { int valor ->
    valor * 5
}

def somaDoisValores = { a, b ->
    a + b
}

// TESTES
olaMundo()
println duplique(2)
println multiplique(3)
println multipliqueInteiros(2)
println somaDoisValores(3, 6)