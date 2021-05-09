package cadastrozoologico;
/**
 *
 * @author bent0vict0r
 */
public class Animal {
    private String raca;
    private float peso;
    private short jaula;
    private boolean restricao;
    
    /* Construtor para classe Animal    */
    public Animal(String raca, float peso, short jaula, boolean restricao){
    this.raca = raca;
    this.peso = peso;
    this.jaula = jaula;
    this.restricao = restricao;
    }
    
    /* Métodos Get's */
    public String getRaca(){
        return raca;
    }
    public float getPeso(){
        return peso;
    }
    public short getJaula(){
        return jaula;
    }
    public boolean getRestricao(){
        return restricao;
    }
    
    /* Métodos Set's */
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public void setJaula(short jaula){
        this.jaula = jaula;
    }
    public void setRestricao(boolean restricao){
        this.restricao = restricao;
    }
}
