package Genericos_EnhancedFor;

import java.util.ArrayList;
import java.util.List;

public class _1UsoEnhancedFor {

    public static void main(String[] args) {
        List<String> colecao = new ArrayList();
        colecao.add(new String("String Z"));
        colecao.add(new String("String Y"));
        colecao.add(new String("String L"));
        colecao.add(new String("String P"));
        
        for(String s : colecao){
            System.out.println(s);
        }
    }
}
