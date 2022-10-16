package cadastrodefuncionarios;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Gerente> gerentes;
    private ArrayList<Secretario> secretarios;

    public DataBase() {
        gerentes = new ArrayList<Gerente>();
        secretarios = new ArrayList<Secretario>();
    }
    
    public void newGerentes(Gerente novoGerente) {
        gerentes.add(novoGerente);
    }

    public void newSecretarios(Secretario novoSecretario) {
        secretarios.add(novoSecretario);
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public ArrayList<Secretario> getSecretarios() {
        return secretarios;
    }
    
    
    
}
