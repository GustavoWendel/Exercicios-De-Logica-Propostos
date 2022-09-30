package br.com.exercicios.desafioextra.model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AgendaContatos {

    private final Map<String, String> contatos = new HashMap<>();

    public Map<String, String> getContatos() {
        return contatos;
    }

    public void adicionar(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    public String consultar(String nome) {
        return contatos.get(nome).toLowerCase(Locale.ROOT);
    }

    public String pesquisarContato(String telefone) {
        for (Map.Entry<String, String> entry: contatos.entrySet()) {
            if (entry.getValue().equals(telefone)) {
                return entry.getKey();
            }
        }
        return telefone;
    }

}
