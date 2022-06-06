package one.digitalinnovation.digionebank

class Pessoa {

    var nome:String = "Jether"
    var cpf:String = "123.545.345.12-12"

}

fun main(){
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)
}