// Main.java - Demonstração de uso do Facade
public class Main {
    public static void main(String[] args) {
        CursoFacade facade = new CursoFacade();

        // Registrar aluno
        int alunoId = facade.registrarAluno("Érick Cipriano", "erick@example.com");

        // Matricular aluno no curso 2 (Estruturas de Dados)
        boolean ok = facade.matricularAluno(alunoId, 2);
        System.out.println("Matrícula retornou: " + ok);

        // Emitir certificado
        String certificado = facade.emitirCertificado(alunoId, 2);
        System.out.println("Código do certificado: " + certificado);
    }
}
