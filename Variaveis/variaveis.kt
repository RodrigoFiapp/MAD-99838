// Exemplo de variável em Kotlin

//fun main () {

 //   val nome = "Rodrigo" //Variável tipo string  // pode ser alterada multável
 //   val idade = 19 //Variável do tipo inteira    //não pode ser alterada não multável
//  println("Nome: $nome, Idade: $idade")
//}

//Declaração e Inicialização de Variáveis
//Int, Double, String, boolean - Mais utilizados.

// fun main() {

//     val numeroInteiro: Int = 10
//     var numeroDecimal: Double = 3.14
//     val texto: String = "Olá Mundo!"
//     var status: Boolean = true // se true o stts é online se falso é offline(0 ou 1)

//     println("Número Inteiro: $numeroInteiro")
//     println("Número Decimal: $numeroDecimal")
//     println("Texto:$texto")
//     println("Status:$status")
// }

//Varíaveis com tipo de dados
//char, byte , short, Long

// fun main() {

//     val numeroInteiro: Int = 10
//     val numeroLong: Long = 1000000
//     val numeroDecimal: Double = 211.14
//     val caractere: Char = 'V'
//     val texto: String = "Kotlin também serve para back end"
//     val verdadeiro: Boolean = true

//     println("Inteiro: $numeroInteiro")
//     println("Long: $numeroLong")
//     println("Decimal:$numeroDecimal")
//     println("caractere: $caractere")
//     println("Texto: $texto")
//     println("Verdadeiro: $verdadeiro")
// }

//Multabilidade e Imutabilidade no contexto de var e val

// fun main() {

//     var mutavel: Int = 10 //mutável
//     val imutavel: Int = 5 //imutavel
    

//     // mutavel = 15 //0k
//     // imutavel = 20 //Erro ! Não pode ser atribuida um valor a uma 
//     // //variável declarada como imutável
    
//     println("Mutável: $mutavel")
//     println("Imutável: $imutavel")
// }

//Convenções de Nomenclatura

//Exemplo de nomeclatura de variáveis
    // fun main() {

    //     val nomeCompleto: String = "Rodrigo Filho"
    //     val idadeDoUsuario: Int = 19
    //     val valor_Total: Double = 50.0 //Evite Utilizar underscore em nome de variáveis
    //     val inicialNome: Char = 'R'
    //     println("Nome completo: $nomeCompleto")
    //     println("idadeDoUsuario: $idadeDoUsuario")
    //     println("valor_Total: $valor_Total") //evite dar nome de variável assim
    //     println("inicialNome: $inicialNome")
    // }

    //Escopo de Variáveis

    //Exemplo

    fun main () {
        val nome = "Alice"

        if(true) {
            val sobrenome = "Silva" //variável sobrenome só é visivel dentro do bloco
            println("$nome $sobrenome") //Alice Silva
        } else 
        println("$nome $sobrenome") //ERRO! A variável sobrenome não está
        // definida no escopo e não é visivel
    }