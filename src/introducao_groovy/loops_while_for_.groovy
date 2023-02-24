package introducao_groovy

def valor = 0

while(valor < 10) {
    println "WHILE > $valor"
    valor += 1
}

def lista = [0, 1, 2, 3]

// Foreach em groovy
for (numero in lista) {
    println "FOREACH > $numero"
}

// For simples em groovy
for(i = 0; i < 10; i += 4) {
    println "FOR > $i"
}
