public class Pessoa {

    public String elogiarLoja(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioSecretaria(mensagem);
    }

    public String reclamarLoja(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoSecretaria(mensagem);
    }

    public String sugerirLoja(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoSecretaria(mensagem);
    }

}
