package introducao_groovy
// Testes de booleanas String e inteiros
def texto = "texto" // teste passa como verdadeiro: o texto n�o est� vazio
assert texto

def textoVazio = "" // teste passa como falso: o texto est� vazio
assert textoVazio

// Teste booleanos para tipos numericos
assert 1 // teste passa como verdadeiro: � diferente de zero
assert -1 // teste passa como verdadeiro: � diferente de zero
assert 0 // teste falha