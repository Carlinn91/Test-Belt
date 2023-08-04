import DAO.usuarioDAO;
import Entidades.usuarios;

public class App {

    public static void main(String[] args) throws Exception {

        usuarios u = new usuarios();
        u.setC1_codigo(1);
        u.setc2_descricao("Teste Belt concluido");

        new usuarioDAO().cadastrarDescricao(u);
    }
}