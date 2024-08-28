package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {
	
	public void exportarDados(Funcionario funcionario) {
	
	
	try {
		
		var printWriter = new PrintWriter("c:\\temp\\funcionario_"
				+ funcionario.getId() + ".txt");
		
		//escrever o conteúdo do arquivo
		printWriter.write("\nID DO CLIENTE........:" + funcionario.getId());
		printWriter.write("\nNOME DO CLIENTE......:" + funcionario.getNome());
		printWriter.write("\nCPF..................:" + funcionario.getCpf());
		printWriter.write("\nMATRÍCULA............:" + funcionario.getMatricula());
		printWriter.write("\nSALÁRIO..............:" + funcionario.getSalario());
		
		printWriter.close();
		
	}
	catch (Exception e) {
		
	System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO" + e.getMessage());
	
			}	
	
		}

	
	
	

}
