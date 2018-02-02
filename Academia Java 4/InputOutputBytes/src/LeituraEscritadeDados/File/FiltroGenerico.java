package LeituraEscritadeDados.File;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroGenerico implements FilenameFilter {

    private String extensao;

    public FiltroGenerico(String extensao) {
        this.extensao = extensao;
    }

    @Override
    public boolean accept(File dir, String name) {
        boolean ok = name.endsWith(this.extensao);
        return ok;
    }
    

}
