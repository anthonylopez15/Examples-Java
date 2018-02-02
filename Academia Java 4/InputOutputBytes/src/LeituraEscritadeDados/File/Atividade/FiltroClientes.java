/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeituraEscritadeDados.File.Atividade;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Anthony
 */
public class FiltroClientes implements FilenameFilter {


    @Override
    public boolean accept(File dir, String nomeDoArquivo) {

        boolean inicioOk = nomeDoArquivo.startsWith("Cliente");
        boolean extensaoOk = nomeDoArquivo.endsWith(".ser");

        return inicioOk && extensaoOk;
    }
}
