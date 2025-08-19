// CursoFacade.java
public class CursoFacade {
    private UsuarioService usuarioService = new UsuarioService();
    private CursoService cursoService = new CursoService();
    private PagamentoService pagamentoService = new PagamentoService();
    private CertificadoService certificadoService = new CertificadoService();

    // Registra um aluno e retorna o seu id
    public int registrarAluno(String nome, String email) {
        int id = usuarioService.criarUsuario(nome, email);
        System.out.println("[CursoFacade] Aluno registrado com id=" + id);
        return id;
    }

    // Faz a matrícula completa (verifica vagas, processa pagamento e matricula)
    public boolean matricularAluno(int usuarioId, int cursoId) {
        System.out.println("[CursoFacade] Iniciando matrícula para usuario=" + usuarioId + " no curso=" + cursoId);
        boolean disponivel = cursoService.verificarVagas(cursoId);
        if (!disponivel) {
            System.out.println("[CursoFacade] Matrícula cancelada: sem vagas.");
            return false;
        }
        boolean pago = pagamentoService.processarPagamento(usuarioId, cursoId);
        if (!pago) {
            System.out.println("[CursoFacade] Matrícula cancelada: pagamento falhou.");
            return false;
        }
        cursoService.matricular(usuarioId, cursoId);
        System.out.println("[CursoFacade] Matrícula concluída com sucesso.");
        return true;
    }

    // Emite certificado se o aluno concluiu o curso
    public String emitirCertificado(int usuarioId, int cursoId) {
        System.out.println("[CursoFacade] Processando emissão de certificado para usuario=" + usuarioId + " curso=" + cursoId);
        if (!cursoService.concluiuCurso(usuarioId, cursoId)) {
            return "Aluno não concluiu o curso";
        }
        return certificadoService.gerarCertificado(usuarioId, cursoId);
    }
}
