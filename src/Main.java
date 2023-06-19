import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao(" Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao(" Descricao Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("Conteudos Inscritos: " + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devGuilherme.getConteudosConcluidos());
        System.out.println(devGuilherme.calcularTotalXp());


    }
}