/* Foram declarados duas MainPessoas com o mesmo metodo, 'grite()',
não havento uma interface em comum entres as MainPessoas e o método/função fale recebe
um valor cujo o tipo é idenfinido.
 */
def fale(bicho) {
    bicho.grite()
}

fale(new Galinha())
fale(new Pato())