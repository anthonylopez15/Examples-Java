package LeituraEscritadeDados.File;

import java.io.File;
import java.io.FilenameFilter;

public class TesteFiltros {
    
    public static void main(String[] args) {
        String nomeDiretorio = ".";
        String extensao = ".ser";
        File diretorio = new File(nomeDiretorio);
        if (diretorio.isDirectory()){
            //Criamos o filtro que mostra somente arquivos com a extensao 
            //indicada
            FilenameFilter filtro = new FiltroGenerico(extensao);
            
            //Diretiva para listar os arquivos do diretorio, adicionando
            //habilidade de filtro
            
            String arquivos[] = diretorio.list(filtro);
            System.out.println("Lista de arquivos com a extensao : " + extensao);
            for (int i = 0; i < arquivos.length; i++) {
                System.out.println(arquivos[i]);                
            }
        }else{
            System.out.println("Nao eh um diretorio");
        }
    }
    
}
