package stream_api.map.ordenacao.eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
        eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    }

    public void exibirAgenda() {
        eventosMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    LocalDate dataEvento = entry.getKey();
                    Evento evento = entry.getValue();
                    System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
                });
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        eventosMap.entrySet().stream()
                .filter(entry -> !entry.getKey().isBefore(dataAtual))
                .findFirst()
                .ifPresentOrElse(entry -> {
                    LocalDate proximaData = entry.getKey();
                    Evento proximoEvento = entry.getValue();
                    System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
                }, () -> System.out.println("Não há eventos futuros na agenda."));
    }


}