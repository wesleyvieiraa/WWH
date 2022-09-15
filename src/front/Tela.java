package front;

import javax.swing.JOptionPane;

import back.Empresa;
import back.Usuario;

public class Tela {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.setNome(JOptionPane.showInputDialog("Digite seu nome"));
		usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));
		usuario.setCpf(JOptionPane.showInputDialog("Digite seu cpf"));
		
		Empresa empresa = new Empresa();
		
		empresa.setNome(JOptionPane.showInputDialog("Digite o nome da empresa"));
		empresa.setCnpj(JOptionPane.showInputDialog("Digite o cnpj da empresa"));
		
		int quantidadeCargos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cargos disponíveis"));
		String[] cargos = new String[quantidadeCargos];
		
		for (int i = 0; i < quantidadeCargos; i++) {
			cargos[i] = JOptionPane.showInputDialog("Digite o nome do cargo");
		}
		
		String[] competencias = new String[quantidadeCargos];
		
		for (int i = 0; i < quantidadeCargos; i++) {
			competencias[i] = JOptionPane.showInputDialog("Digite as competências");
		}
		
		String cargosDisponiveis = "";
		String competenciasDisponiveis = "";
		
		for (String cargo : cargos) {
			cargosDisponiveis = cargosDisponiveis + ", " + cargo;
		}
		
		for (String competencia : competencias) {
			competenciasDisponiveis = competenciasDisponiveis + ", " + competencia;
		}
		
		empresa.setCargos(cargosDisponiveis);
		
		empresa.setCompetenciasExigidas(competenciasDisponiveis);
		
		String message = 
			"Olá, " + usuario.getNome() + "!" +
			" Seu cpf é: " + usuario.getCpf() + 
			".\n A empresa: " + empresa.getNome() + 
			", cnpj: " + empresa.getCnpj() + 
			" possui os seguintes cargos: " + empresa.getCargos() +
			" e, exige as seguintes competências: " + empresa.getCompetenciasExigidas() +
			" para pessoas de " + usuario.getIdade() + " anos.";
		
		JOptionPane.showMessageDialog(null, message);
	}
}
