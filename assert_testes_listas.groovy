def lista = new ArrayList()

lista.add("Valor")

assert lista // teste verdadeiro: lista não esta vazia
lista.clear()
//assert lista // teste falha: a lista é vazia


def listaIterator = new ArrayList()

listaIterator.add("Valor")

def iterator = listaIterator.iterator()

assert iterator // teste verdadeiro: interador tem itens
iterator.next() // Foi para o final da lista
assert iterator // teste falso: sem mais itens