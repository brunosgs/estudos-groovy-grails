/*
    OBS: A instrução return é opcional, o retorno de uma função pode ser o valor 
    resultante da execução da última linha do bloco.
*/

// Função com paramentros
def delta(a, b, c) {
    return (b*b) - (4*a*c)
}

println "Delta > ${delta(1, 2, 3)}"

// Função sem parametros
def tempoCorrente() {
    return System.currentTimeMillis()
}

println "${tempoCorrente()}"

def tempoCorrenteSemReturn() {
    System.currentTimeMillis()
}

println "${tempoCorrenteSemReturn()}"