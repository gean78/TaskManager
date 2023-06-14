package com.example.taskmanager.Controller;

import com.example.taskmanager.Entity.Tarefa;
import com.example.taskmanager.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerenciador/")
public class TarefaController {



    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tasks")
    public List<Tarefa> buscarTarefas() {
        return tarefaService.buscarTarefas();
    }
    @GetMapping("/task/{id}")
    public Tarefa buscarTarefa(@PathVariable  Long id) {
        return tarefaService.buscarTarefa(id);
    }
    @PostMapping ("/register")
    public Tarefa cadastrarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.cadastrarTarefa(tarefa);
    }
    @PutMapping("/update/{id}")
    public Tarefa atualizUsuario(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return tarefaService.atualizarTarefa(id,tarefa);}

}
