import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveElogiarLoja() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Loja respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Loja agradece a mensagem: Ótimo atendimento",
                cliente.elogiarLoja("Ótimo atendimento"));
    }

    @Test
    public void deveReclamarLoja() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Loja respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Loja vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarLoja("Lentidão no atendimento"));
    }

    @Test
    public void deveSugerirLoja() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Loja respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Loja vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirLoja("Ampliar horário funcionamento"));
    }


}