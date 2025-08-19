// CursoService.java (simulado)
import java.util.HashMap;
import java.util.Map;

public class CursoService {
    private Map<Integer, String> cursos = new HashMap<>();
    private Map<Integer, Integer> vagas = new HashMap<>(); // cursoId -> vagas disponíveis

    public CursoService() {
        // populando alguns cursos de exemplo
        cursos.put(1, "Introdução à Programação");
        cursos.put(2, "Estruturas de Dados");
        cursos.put(3, "Engenharia de Software");

        vagas.put(1, 10);
        vagas.put(2, 5);
        vagas.put(3, 2);
    }

    public boolean verificarVagas(int cursoId) {
        Integer v = vagas.get(cursoId);
        boolean ok = v != null && v > 0;
        System.out.println("[CursoService] Verificar vagas para curso " + cursoId + ": " + ok);
        return ok;
    }

    public void matricular(int usuarioId, int cursoId) {
        System.out.println("[CursoService] Matrícula: usuario " + usuarioId + " no curso " + cursoId + " (" + cursos.get(cursoId) + ")");
        vagas.put(cursoId, vagas.get(cursoId) - 1);
    }

    public boolean concluiuCurso(int usuarioId, int cursoId) {
        // implementação simulada: assume que sempre concluiu para exemplo
        System.out.println("[CursoService] Verificando conclusão do usuário " + usuarioId + " no curso " + cursoId);
        return true;
    }

    public String obterNomeCurso(int cursoId) {
        return cursos.getOrDefault(cursoId, "Curso Desconhecido");
    }
}
