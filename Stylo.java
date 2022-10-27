package umlJva;

public class Stylo {
    private String type;
    private String couleur;
    private Stagiare stgr;
  
    public Stylo (String T,String C,Stagiare S) {
        this.type=T;
        this.couleur=C;
        this.stgr=S;

        
    }
    
    public String gettype(){
        return type;
    }
    public String getcouleur(){
        return couleur;
    }
    public Stagiare getstgr(){
        return stgr;
    }
    public void settype(String T){
        this.type=T;
    }
    public void setcouleur(String C){
        this.couleur=C;
    }
    
    
    
}
