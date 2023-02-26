package closures.escopo

class Animal {
    def closure
    def nome

    def fale() {
        closure.delegate = this
        closure()
    }
}