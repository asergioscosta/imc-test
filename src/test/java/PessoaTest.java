import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveRetornarHomemAbaixoPeso() {
        pessoa.setSexo("Masculino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        assertEquals("abaixo do peso", pessoa.verificarImc());
    }

    @Test
    void deveRetornarHomemPesoNormal() {
        pessoa.setSexo("Masculino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        assertEquals("no peso normal", pessoa.verificarImc());
    }

    @Test
    void deveRetornarHomemMarginalmenteAcimaPeso(){
        pessoa.setSexo("Masculino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        assertEquals("marginalmente acima do peso", pessoa.verificarImc());
    }

    @Test
    void deveRetornarHomemAcimaPesoIdeal(){
        pessoa.setSexo("Masculino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        assertEquals("acima do peso ideal", pessoa.verificarImc());
    }

    @Test
    void deveRetornarHomemObeso(){
        pessoa.setSexo("Masculino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.1f);
        assertEquals("obeso", pessoa.verificarImc());
    }

    @Test
    void deveRetornarMulherAbaixoPeso(){
        pessoa.setSexo("Feminino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        assertEquals("abaixo do peso", pessoa.verificarImc());
    }

    @Test
    void deveRetornarMulherPesoNormal(){
        pessoa.setSexo("Feminino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        assertEquals("no peso normal", pessoa.verificarImc());
    }

    @Test
    void deveRetornarMulherMarginalmenteAcimaPeso(){
        pessoa.setSexo("Feminino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        assertEquals("marginalmente acima do peso", pessoa.verificarImc());
    }

    @Test
    void deveRetornarMulherAcimaPesoIdeal(){
        pessoa.setSexo("Feminino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        assertEquals("acima do peso ideal", pessoa.verificarImc());
    }

    @Test
    void deveRetornarMulherObeso() {
        pessoa.setSexo("Feminino");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.4f);
        assertEquals("obeso", pessoa.verificarImc());
    }
}