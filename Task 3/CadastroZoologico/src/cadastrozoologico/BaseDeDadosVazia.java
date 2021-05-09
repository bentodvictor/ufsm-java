/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrozoologico;

/**
 *
 * @author bent0vict0r
 */
public class BaseDeDadosVazia extends Exception {
    public BaseDeDadosVazia(String aviso){ /*Construtor que exibe uma mensagem quando banco de dados está vazio */
        super(aviso);                             /*Na hora de lançar o throw é´passado a mensagem indicativa*/
    }   
}
