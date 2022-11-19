import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFabio = new Dev();
        devFabio.setNome("Fábio");
        devFabio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devFabio.getNome() +
        ": " + devFabio.getConteudosInscritos());   

        devFabio.progredir();
        devFabio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devFabio.getNome() +
        ": " + devFabio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devFabio.getNome() +
        ": " + devFabio.getConteudosConcluidos());
        System.out.println("XP: " + devFabio.calcularTotalXp());

        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() +
        ": " + devJoao.getConteudosInscritos());             

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() +
        ": " + devJoao.getConteudosInscritos());        
        System.out.println("Conteúdos Concluídos " + devJoao.getNome() +
        ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}