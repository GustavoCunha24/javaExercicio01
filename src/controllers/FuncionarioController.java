package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	public void cadastrarFuncionario() {
		
		var funcionario = new Funcionario();
		
		try {
			
		funcionario.setId(UUID.randomUUID());
		funcionario.setNome(JOptionPane.showInputDialog("INFORME O NOME DO CLIENTE:"));
		funcionario.setCpf(JOptionPane.showInputDialog("INFORME O CPF:"));
		funcionario.setMatricula(JOptionPane.showInputDialog("INFORME A MATRÍCULA:"));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("INFORME O SALÁRIO:")));
		
		System.out.println("\nID.......:" + funcionario.getId());
		System.out.println("\nNOME.....:" + funcionario.getNome());
		System.out.println("\nCPF......:" + funcionario.getCpf());
		System.out.println("\nMATRÍCULA:" + funcionario.getMatricula());
		System.out.println("\nSALÁRIO..:" + funcionario.getSalario());
		
		var funcionarioRepository = new FuncionarioRepository();
		funcionarioRepository.exportarDados(funcionario);
		
		System.out.println("\nFUNCIONÁRIO CADASTRADO COM SUCESSO!");
	
		
		}
		catch (Exception e) {
			System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO! " + e.getMessage());
			
		}
		
	}
	
}
