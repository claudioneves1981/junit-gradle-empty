package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(3,pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa julia = new Pessoa("Julia", LocalDate.of(2000,1,1));
        Assertions.assertTrue(julia.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDate.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
