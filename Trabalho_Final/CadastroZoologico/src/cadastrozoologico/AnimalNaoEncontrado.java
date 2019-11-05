/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrozoologico;
import java.io.IOException;
/**
 *
 * @author bent0vict0r
 */
public class AnimalNaoEncontrado extends Exception {
    public AnimalNaoEncontrado(String aviso){ /*Construtor que exibe uma mensagem quando animal não encontrado*/
        super(aviso);                             /*Na hora de lançar o throw é passado a mensagem indicativa*/
    }
    
}
