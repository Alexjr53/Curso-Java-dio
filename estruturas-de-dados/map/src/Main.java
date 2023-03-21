import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Map<String, String> aluno = new HashMap<>();
        
        aluno.put("nome", "joão");
        aluno.put("idade", "17");
        aluno.put("media", "8.5");
        aluno.put("turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        
        aluno2.put("nome", "maria");
        aluno2.put("idade", "18");
        aluno2.put("media", "8.9");
        aluno2.put("turma", "3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("nome"));
    }

}