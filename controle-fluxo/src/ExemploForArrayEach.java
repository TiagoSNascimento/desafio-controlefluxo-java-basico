public class ExemploForArrayEach {
    public static void main(String[] args) {

        //em arrays o indice inicia com ZERO
        String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
