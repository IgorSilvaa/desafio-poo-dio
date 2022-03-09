import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("desctição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("desctição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devIgor = new Dev();
		devIgor.setNome("Igor");
		devIgor.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Igor: " + devIgor.getConteudosInscritos());
		
		devIgor.progredir();
		devIgor.progredir();
		
		System.out.println("-");
		System.out.println("Conteudos Inscritos Igor: " + devIgor.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Igor: " + devIgor.getConteudosConcluidos());
		System.out.println("XP " + devIgor.calcularTotalXp());
		
		System.out.println("-----------------");
		
		Dev devThais = new Dev();
		devThais.setNome("Thais");
		devThais.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Thais: " + devThais.getConteudosInscritos());

		devThais.progredir();
		devThais.progredir();
		devThais.progredir();
		
		System.out.println("-");
		System.out.println("Conteudos Inscritos Thais: " + devThais.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Thais: " + devThais.getConteudosConcluidos());
		System.out.println("XP " + devThais.calcularTotalXp());
		
		
		
		
		
	}

}
