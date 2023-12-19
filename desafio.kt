// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val name: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        for( i in usuario){
            inscritos.add(i)
            println("$i matriculado \ncom conteúdo $conteudos.toString .\n")
        }
    }
}

fun main() {
//     TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//     TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
		
    val aluno1= Usuario(name= "Edilson", email= "edilson123@gmail.com")
    val aluno2= Usuario(name= "José", email= "jose123@gmail.com")
    val aluno3= Usuario(name= "Maria", email= "maria123@gmail.com")
    val conteudo = mutableListOf(ConteudoEducacional("Aprendizado com Kotlin",duracao= 60 , Nivel.BASICO))
    val formacao = Formacao("koltin", conteudo )
    formacao.matricular(aluno1, aluno2, aluno3)
    
}
