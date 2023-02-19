// Interpolação
sufixo = "Groovy"
fraseCompletaInterpolada = "Programando em ${sufixo}"

a = 3
b = 5

expressaoInterpolada = "${a} + ${b} = ${a + b}"

c = 3
texto = "Qual o valor de c? É $c"

texto = """Olá mundo!
Estou desenvolvendo com Groovy.
E me encantando com a linguagem. :)"""

d = 5
e = 10

muitasLinhasInterpoladas = """d = ${d}
e = $e
d + e = ${d + e}"""