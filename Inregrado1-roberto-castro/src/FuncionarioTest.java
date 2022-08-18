import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    Funcionario f1, f2, f3;

    @BeforeEach
    void doBefore(){
        f1 = new Funcionario("Luke", "Skywalker", 19, 15, 2);
        f2 = new Funcionario("Obi Wan", "Kenobi", 48, 750, 50);
        f3 = new Funcionario("Yoda", "San", 870, 15000, 20000);
    }

    @Test
    void mostrarCategoria(){
        assertEquals(190, f1.calcularPontos());
        assertEquals(4490, f2.calcularPontos());
        assertEquals(279350, f3.calcularPontos());
    }

}