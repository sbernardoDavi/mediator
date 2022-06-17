public class Loja implements Setor {

    private static Loja instancia = new Loja();

    private Loja() {}

    public static Loja getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Loja vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Loja agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Loja vai analisar a sugestão: " + mensagem;
    }
}
