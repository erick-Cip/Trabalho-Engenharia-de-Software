// PagamentoService.java (simulado)
public class PagamentoService {
    public boolean processarPagamento(int usuarioId, int cursoId) {
        System.out.println("[PagamentoService] Processando pagamento do usuario " + usuarioId + " para o curso " + cursoId);
        // Simulação: sempre sucesso
        return true;
    }

    public String verificarStatus(int pagamentoId) {
        return "CONFIRMADO";
    }
}
