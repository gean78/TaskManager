package com.example.taskmanager.Service;

import com.example.taskmanager.Entity.Tarefa;
import com.example.taskmanager.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> buscarTarefas() {
        return tarefaRepository.buscarTarefas();
    }

    public Tarefa buscarTarefa(Long id) {
        return tarefaRepository.buscarTarefaporId(id);
    }


    public Tarefa cadastrarTarefa(Tarefa tarefa) {
//        for (Tarefa t : tarefaRepository.buscarTarefas()) {
//            if (t.getTitulo().equals(tarefa.getTitulo())) {
//                return null;
//          }
//        }
        return tarefaRepository.AdicionarTarefa(tarefa);
    }

    public Tarefa atualizarTarefa(Long id, Tarefa tarefa) {
        Tarefa tarefa1 = tarefaRepository.buscarTarefaporId(id);
        if (tarefa1 == null) {
            return null;
        } else {

            tarefa.setId(id);
            tarefaRepository.deletartarefa(tarefa1);
            tarefaRepository.AdicionarTarefa(tarefa);
            return tarefa;
        }
    }
}
