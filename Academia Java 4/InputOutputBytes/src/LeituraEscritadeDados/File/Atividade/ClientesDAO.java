/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeituraEscritadeDados.File.Atividade;

import java.util.List;

/**
 *
 * @author Anthony
 */
public interface ClientesDAO {
 
     /**
     * @param cliente
     *            Cliente a ser inserido na fonte de dados
     * @throws GlobalcodeException
     */
    public void salvar(Cliente cliente) throws GlobalcodeException;

    /**
     * @param cpf
     *            CPF do Cliente a ser excluido da fonte de dados
     * @throws GlobalcodeException
     */
    public void excluir(String cpf) throws GlobalcodeException;

    /**
     * @return java.util.List Colecao contendo todos os clientes da fonte da dados em questao
     * @throws GlobalcodeException
     */
    public List<Cliente> getAllClientes() throws GlobalcodeException;

    /**
     * @param cpf
     *            CPF do cliente a ser pesquisado na fonte de dados
     * @return Cliente
     * @throws GlobalcodeException
     */
    public Cliente getClienteByCPF(String cpf) throws GlobalcodeException;
}

