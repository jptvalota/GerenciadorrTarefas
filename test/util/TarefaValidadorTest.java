/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import org.junit.Test;
import static org.junit.Assert.*;



public class TarefaValidadorTest {
      @Test
    public void testCamposPreenchidos() {
        TarefaValidador validador = new TarefaValidador();
        boolean resultado = validador.camposObrigatoriosPreeenchidos("Comprar pão", "Ir à padaria antes das 8h");
        assertTrue("Campos preenchidos corretamente", resultado);
    }

    @Test
    public void testNomeTarefaVazio() {
        TarefaValidador validador = new TarefaValidador();
        boolean resultado = validador.camposObrigatoriosPreeenchidos("", "Descrição qualquer");
        assertFalse("Nome da tarefa está vazio", resultado);
    }

    @Test
    public void testDescricaoVazia() {
        TarefaValidador validador = new TarefaValidador();
        boolean resultado = validador.camposObrigatoriosPreeenchidos("Título", "");
        assertFalse("Descrição está vazia", resultado);
    }

    @Test
    public void testAmbosVazios() {
        TarefaValidador validador = new TarefaValidador();
        boolean resultado = validador.camposObrigatoriosPreeenchidos("", "");
        assertFalse("Ambos os campos estão vazios", resultado);
    }
}
