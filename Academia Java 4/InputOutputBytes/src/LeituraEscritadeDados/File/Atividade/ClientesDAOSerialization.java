/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeituraEscritadeDados.File.Atividade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anthony
 */
public class ClientesDAOSerialization implements ClientesDAO {

    @Override
    public void salvar(Cliente cliente) throws GlobalcodeException {
        File f = new File("Cliente" + cliente.getCpf() + ".ser");

        if (cliente.getId() == 0) {
            // definicao de id por sorteio
            cliente.setId(1 + (int) (999999 * Math.random()));
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(cliente);
        } catch (FileNotFoundException e) {
            throw new GlobalcodeException(e, "Arquivo Inexistente!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                } else if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new GlobalcodeException(e,
                        "Erro ao fechar o fluxo de escrita");
            }
        }
    }

    @Override
    public void excluir(String cpf) throws GlobalcodeException {
        File f = new File("Cliente" + cpf + ".ser");
        if (f.exists()) {
            boolean apagou = f.delete();
            if (apagou == false) {
                String msg = "Impossivel remover o arquivo " + f.getName()
                        + " - deve estar sendo utilizado por outro processo";
                throw new GlobalcodeException(msg);
            }
        } else {
            throw new GlobalcodeException("Cliente nÃ£o encontrado com cpf = " + cpf);
        }
    }

    @Override
    public List<Cliente> getAllClientes() throws GlobalcodeException {

        // este objeto representa o diretorio de trabalho atual
        File diretorioAtual = new File(".");
       
        try {
            System.out.println("diretorio atual:" + diretorioAtual.getCanonicalPath());
        } catch (IOException ex) {
            System.out.println("Erro ao obter nome completo do diretorio atual: " + ex.getMessage());
        }

        FilenameFilter filtro = new FiltroClientes();
        String[] nomesArquivosFiltrados = diretorioAtual.list(filtro);

        // montagem da lista de clientes recuperados do sistema de arquivos
        List<Cliente> todosClientes = new ArrayList<Cliente>();
        for (String nomeArquivo : nomesArquivosFiltrados) {
            String cpf = nomeArquivo.substring(7, nomeArquivo.length() - 4);
            Cliente umCliente = getClienteByCPF(cpf);
            todosClientes.add(umCliente);
        }
        return todosClientes;
    }

    @Override
    public Cliente getClienteByCPF(String cpf) throws GlobalcodeException {
        File f = new File("Cliente" + cpf + ".ser");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Cliente c = null;
        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            c = (Cliente) ois.readObject();
        } catch (IOException e) {
            throw new GlobalcodeException(e,
                    "Erro ao executar operacao de leitura");
        } catch (ClassNotFoundException e) {
            throw new GlobalcodeException(e,
                    "Erro ao localizar a classe Cliente.class");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                } else if (fis != null) {
                    fis.close();
                }

            } catch (IOException e) {
                throw new GlobalcodeException(e,
                        "Erro ao fechar o fluxo de leitura");
            }
        }
        return c;
    }
}
