package introducao_groovy

def valor = 4

/* OBS > Durante a comparação, ao chegar nesta opção, 
Groovy transformou nosso valor em uma string e, em seguida, 
o comparou com o case
*/
switch (valor) {
    case "4":
        println 'Eu sou um quatro-string!'
        break
    case 5:
        println 'Eu sou um cinco.'
        break
    case 4:
        println 'Sou um quatro!'
        break
    default:
        println "Sou alguma outra coisa: $valor"
}
