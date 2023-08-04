import DAO.usuarioDAO;
import Entidades.usuarios;

public class App {

    /** 
     * Criação de usuário, os códigos foram colocados, não consegui testar devido não ter mais a senha 
     * do meu BD, tudo indica que estão corretos, mas sem confirmação visual.
 */

    public static void main(String[] args) throws Exception {

        usuarios u = new usuarios();
        u.setC1_codigo(1);
        u.setc2_descricao("Teste Belt concluido");

        new usuarioDAO().cadastrarDescricao(u);
    }
}