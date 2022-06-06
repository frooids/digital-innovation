package one.digitalinnovation.digionebank

class Pessoa {

    var nome:String = "Jether"
    var cpf:String = "123.545.345.12-12"
        private set

    constructor()

    inner class Endereco {
        var rua: String = "rua glória"
    }
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.Endereco().rua)
}