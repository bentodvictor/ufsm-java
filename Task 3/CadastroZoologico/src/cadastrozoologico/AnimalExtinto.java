package cadastrozoologico;
/**
 *
 * @author bent0vict0r
 */
public class AnimalExtinto extends Animal{
    private boolean riscoExtincao;
    private int especiesRestantes;
    private int estimativaExtincao;
    
    /* Construtor para classe Extinção e para superclasse Animal    */
    public AnimalExtinto(String raca, float peso, short jaula, boolean restricao, 
                        boolean riscoExtincao, int especiesRestantes, int estimativaExtincao){
        super(raca, peso, jaula, restricao);
        this.riscoExtincao = riscoExtincao;
        this.especiesRestantes = especiesRestantes;
        this.estimativaExtincao = estimativaExtincao;
    }
    
    /*  Métodos Get's   */
    public boolean getRiscoExtincao(){
        return riscoExtincao;
    }
    public int getEspeciesRestantes(){
        return especiesRestantes;
    }
    public int getEstimativaExtincao(){
        return estimativaExtincao;
    }
    
    /*  Métodos Set's   */
    public void setRiscoExtincao(boolean riscoExtincao){
        this.riscoExtincao = riscoExtincao;
    }
    public void setEspeciesRestantes(int especiesRestantes){
        this.especiesRestantes = especiesRestantes;
    }
    public void setEstimativaExtincao(int estimativaExtincao){
        this.estimativaExtincao = estimativaExtincao;
    }
}
