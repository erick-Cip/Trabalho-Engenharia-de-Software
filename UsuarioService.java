// UsuarioService.java (simulado)
public class UsuarioService {
    private int nextId = 1;

    public int criarUsuario(String nome, String email) {
        int id = nextId++;
        System.out.println("[UsuarioService] Usuário criado: id=" + id + ", nome=" + nome + ", email=" + email);
        return id;
    }

    public String buscarUsuario(int id) {
        System.out.println("[UsuarioService] Buscando usuário id=" + id);
        return "Usuario#" + id;
    }
}
