package one.digitalinnovationon.junit;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,1,1));
        assertEquals(3,pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa julia = new Pessoa("Julia", LocalDate.of(2000,1,1));
        assertTrue(julia.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDate.now());
        assertFalse(joao.ehMaiorDeIdade());
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());
        assertNotNull(pessoa);
    }
}
