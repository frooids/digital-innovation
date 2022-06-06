package one.digitalinnovation.digionebank

fun main() {
    TipoPessoa.values().forEach {
        println("Tipo pessoa: ${it.nome}, Descricao: ${it.descricao}")
    }

    var pf = TipoPessoa.PF
    println("${pf.nome}, ${pf.descricao}")
    var pj = TipoPessoa.PJ
    println("${pj.nome}, ${pj.descricao}")
}
