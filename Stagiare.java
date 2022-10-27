package umlJva;

import java.util.ArrayList;

public class Stagiare {
    private String nom;
    private String prenom;
    private ArrayList<Stylo> stylo;
    public Stagiare(String N ,String P,ArrayList<Stylo> S){
        this.nom=N;
        this.prenom=P;
        this.stylo=S;
    }
    public void setnom(String N){
        this.nom=N;
    }
    public void setprenom(String p){
        this.nom=p;
    }
    public void setstylo(ArrayList<Stylo> S){
        this.stylo=S;
    }
    public String getnom(){
        return nom;
    }
    public String getprenom(){
        return prenom;
    }
    public ArrayList<Stylo> getstylo(){
        return stylo;
    }
    
   
}