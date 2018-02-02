package LeituraEscritadeDados.File;

import java.io.File;
import java.util.Date;

public class File1Manager {

    public static void printProperties(String fileName) {
        File f = new File(fileName);
        System.out.println("==========================================");
        if(f.exists()){
            File1Manager.printCommonProperties(f);
            if(f.isDirectory()){
                File1Manager.printDirectoryProperties(f);
            }else if(f.isFile()){
                File1Manager.printFilePropertirs(f);
            }
            System.out.println("==========================================");
        }else{
            System.out.println("O arquivo " + fileName + " nao existe");
        }
    }

    private static void printCommonProperties(File f) {
        System.out.println("Path -------------------- " + f.getAbsolutePath());
        String permissoes = "Permissoes -------------- ";
        permissoes += f.canRead() ? "Leitura " : "";
        permissoes += f.canWrite() ? "Escrita " : "";
        System.out.println(permissoes);
    }

    private static void printDirectoryProperties(File f) {
        Date d = new Date(f.lastModified());
        System.out.println("ULTIMA MODIFICACAO -------- " + d.toString());
        long tamanho = f.length();
        System.out.println("TAMANHO---- " + tamanho + " bytes");
    }

    private static void printFilePropertirs(File f) {
        String fileNames[] = f.list();
        System.out.println("Conteudo deste diretorio: ");
        for (int i = 0; i < fileNames.length; i++) {
            System.out.println(fileNames[i]);            
        }
    }
    
    public static void main(String[] args) {
        String nomeArquivo = "D:/dados.txt";
        File1Manager.printProperties(nomeArquivo);
    }

}
