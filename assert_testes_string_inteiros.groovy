// Testes de booleanas String e inteiros
def texto = "texto" // teste passa como verdadeiro: o texto não está vazio
assert texto

def textoVazio = "" // teste passa como falso: o texto está vazio
assert textoVazio

// Teste booleanos para tipos numericos
assert 1 // teste passa como verdadeiro: é diferente de zero
assert -1 // teste passa como verdadeiro: é diferente de zero
assert 0 // teste falha