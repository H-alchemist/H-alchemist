package umlJva ;

import java.util.ArrayList;

public class Groupe{
    private String code;
    private ArrayList<Stagiare> stagiare;

public Groupe(String C ,ArrayList<Stagiare> S){
    this.code=C;
    this.stagiare=S;
}
public void setcode(String C){
    this.code=C;
}
public void setStrg(ArrayList<Stagiare> S){
    this.stagiare=S;
}
public String getcode(){
    return code;
}
public ArrayList<Stagiare> getstgr(){
    return stagiare;
}





}




