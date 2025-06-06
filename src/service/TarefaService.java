/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import TarefaDAO.TarefaDAO;
import beans.Tarefa;
import java.util.List;

public class TarefaService {
   
    private final TarefaDAO tarefaDAO;

    public TarefaService() {
        this.tarefaDAO = new TarefaDAO();
    }

    public List<Tarefa> buscarTarefas(String nomeTarefa) {
        return tarefaDAO.getTarefa(nomeTarefa);
    }

}
