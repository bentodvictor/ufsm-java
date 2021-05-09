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
public class CamposInvalidos extends Exception{
    public CamposInvalidos(String aviso){ /*Construtor que exibe uma mensagem quando Campos não foram preenchidos */
        super(aviso);                             /*Na hora de lançar o throw é passado a mensagem indicativa*/
    }   
}