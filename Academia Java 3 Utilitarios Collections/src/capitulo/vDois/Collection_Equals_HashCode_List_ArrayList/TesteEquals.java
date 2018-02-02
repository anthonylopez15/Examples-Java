
package capitulo.vDois.Collection_Equals_HashCode_List_ArrayList;


public class TesteEquals {
    public static void main(String[] args) {
        
    
    Pessoa p1 = new Pessoa("Gabriela", 1112345l, "01/01/1980");
    Pessoa p2 = new Pessoa("Gabriela", 1112345l, "01/01/1980");
    if(p1.equals(p2)){
        System.out.println("p1 = p2 utilizando equals");
    }else{
        System.out.println("p1 eh diferente de p2 uilizando equals");
    }
    
    }
}
