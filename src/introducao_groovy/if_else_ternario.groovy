package introducao_groovy
// if, else e else if
def a = 3

println "Valor atual para testes $a"

if (a <= 3) {
    println "Sou menor ou igual a 3"
}

if (a == 5) {
    println "Sou igual a 5"
} else {
    println "Sou igual a $a"
}

if (a == 5) {
    println "Sou igual a 5"
} else if (a == 4) {
    println "Sou igual a 4"
} else {
    println "Sou diferente de 5 e 4. Sou $a"
}

// Operador ternario, OBS> O operador '==' em groovy equivale a chamada de 'equals()' do Java.
def nome = "Bruno"
def mensagem = nome.equals("Bruno") ? "Belo nome" : "Outro nome"
assert mensagem == "Belo nome" // teste passa.