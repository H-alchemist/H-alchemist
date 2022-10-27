package umlJva;


import java.util.ArrayList;

class test{

public static void main(String [] args) {
    Stylo stl1=new Stylo("a1","red",null);
    Stylo stl2=new Stylo("a1","green",null);
    Stylo stl3=new Stylo("a2","yellow",null);
    Stylo stl4=new Stylo("a3","purple",null);
    ArrayList<Stylo> SS=new ArrayList<Stylo>();
    SS.add(stl1);
    SS.add(stl2);
    SS.add(stl3); 
    SS.add(stl4);   

    Stagiare strg1=new Stagiare("hamza", "ech", SS);
    Stagiare strg2=new Stagiare("ilyass", "ech", SS);
    Stagiare strg3=new Stagiare("ismail", "ech", SS);
    Stagiare strg4=new Stagiare("dress", "ech", SS);
    Stagiare strg5=new Stagiare("hatim", "ech", SS);
    Stagiare strg6=new Stagiare("solaiman", "ech", SS);
    Stagiare strg7=new Stagiare("mohamed", "ech", SS);
    Stagiare strg8=new Stagiare("ayoub", "ech", SS);
    ArrayList<Stagiare> STGR=new ArrayList<Stagiare>();
    STGR.add(strg1);
    STGR.add(strg2);
    STGR.add(strg3);
    STGR.add(strg4);
     STGR.add(strg5);
    STGR.add(strg6);
    STGR.add(strg7);
    STGR.add(strg8);
    Groupe DD104=new Groupe("201",STGR);
    int size=DD104.getstgr().size();
   
 
    for (int i = 0; i < size; i++) {

        System.out.println(DD104.getstgr().get(i).getnom());
        
    }


}
}