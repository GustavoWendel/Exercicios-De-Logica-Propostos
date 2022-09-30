package br.com.exercicios.desafioextra.model;

import java.util.Map;
import java.util.stream.Stream;

public class TesteAgenda {
    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionar("Marcos", "555555");
        agenda.adicionar("Mithrandir", "444444");
        agenda.consultar("Marcos");
        agenda.pesquisarContato("444444");

        Stream<Map.Entry<String, String>> sorted =
                agenda.getContatos().entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        sorted.forEach(System.out::println);
    }
}

