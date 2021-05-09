/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrozoologico;
import java.util.ArrayList;
/**
 *
 * @author bent0vict0r
 */
public class Listagem {
    public ArrayList<Animal> ListAnimal = new ArrayList();
    public ArrayList<AnimalExtinto> ListAnimalExt = new ArrayList();
    
    /*Métodos para cadastrar um Animal */
    public void cadastrarAnimal(Animal a){
        ListAnimal.add(a); /*Insere na lista um contato*/
    }
    /*Métodos para cadastrar um Animal Extinto*/
    public void cadastrarAnimalExt(AnimalExtinto aex){
        ListAnimalExt.add(aex); /*Insere na lista um contato*/
    }
    
    /* Tamanho das listas   */
    public int numeroDeAnimais(){
        return ListAnimal.size();
    }
    public int numeroDeAnimaisExt(){
        return ListAnimalExt.size();
    }
}
