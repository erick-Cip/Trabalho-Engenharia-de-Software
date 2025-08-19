// CertificadoService.java (simulado)
public class CertificadoService {
    public String gerarCertificado(int usuarioId, int cursoId) {
        String codigo = "CERT-" + usuarioId + "-" + cursoId + "-2025";
        System.out.println("[CertificadoService] Gerando certificado: " + codigo);
        return codigo;
    }

    public boolean validarCertificado(String codigo) {
        System.out.println("[CertificadoService] Validando certificado: " + codigo);
        return codigo != null && codigo.startsWith("CERT-");
    }
}
