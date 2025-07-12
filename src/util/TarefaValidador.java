/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Rose
 */
public class TarefaValidador {
    public boolean camposObrigatoriosPreeenchidos(String nomeTarefa,String descricao){
        return !(nomeTarefa.isEmpty() || descricao.isEmpty());
    }
}
