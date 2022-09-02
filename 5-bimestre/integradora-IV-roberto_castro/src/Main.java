import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;
import java.sql.*;

public class Main {
    //Criação da tabela:
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Funcionarios; CREATE TABLE Funcionarios "
            + "("
            + " ID INT PRIMARY KEY, "
            + " Nome VARCHAR(100) NOT NULL, "
            + " Sobrenome VARCHAR(100) NOT NULL, "
            + " Apelido VARCHAR(100) NOT NULL, "
            + " Email VARCHAR(50)"
            + ")";

    //Populando a tabela:
    private static final String sqlInsert1 = "INSERT INTO Funcionarios(ID, Nome, Sobrenome, Apelido, Email)" +
            "VALUES (1, 'Walter', 'White', 'Heisenberg', 'heisenberg@gmail.com')";
    private static final String sqlInsert2 = "INSERT INTO Funcionarios(ID, Nome, Sobrenome, Apelido, Email)" +
            "VALUES (1, 'Jesse', 'Pinkman', 'Diesel', 'dieseljs@yahoo.com')";
    private static final String sqlInsert3 = "INSERT INTO Funcionarios(ID, Nome, Sobrenome, Apelido, Email)" +
            "VALUES (3, 'Skyler', 'White', 'The Wife', 'sw50@outlook.com')";
    private static final String sqlInsert4 = "INSERT INTO Funcionarios(ID, Nome, Sobrenome, Apelido, Email)" +
            "VALUES (5, 'Hank', 'Schrader', 'The Bald', 'hank769@hotmail.com')";
    private static final String sqlInsert5 = "INSERT INTO Funcionarios(ID, Nome, Sobrenome, Apelido, Email)" +
            "VALUES (6, 'Walter', 'White Jr.', 'Júnior', 'wwj@gmail.com')";
    private static final String sqlInsert6 = "INSERT INTO Funcionarios(ID, Nome, Sobrenome, Apelido, Email)" +
            "VALUES (6, 'Walter', 'White Jr.', 'Júnior', 'wwj@gmail.com')";

    //Exclusão de funcionários:
    private static final String sqlDelete = "DELETE FROM Funcionarios WHERE ID = 3";
    private static final String sqlDelete2 = "DELETE FROM Funcionarios WHERE Email = 'sw50@outlook.com'";

    //Edição de funcionários:
    private static final String sqlUpdate = "UPDATE Funcionarios SET Apelido = 'Son' WHERE ID = 2";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        Statement statement = null;
        try {
            connection = getConnection();

            statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            logger.info("Tabela criada com sucesso");

            statement.execute(sqlInsert1);
            logger.info("Funcionário 1 cadastrado com sucesso");
            statement.execute(sqlInsert2);
            logger.info("Funcionário 2 cadastrado com sucesso");
            statement.execute(sqlInsert3);
            logger.info("Funcionário 3 cadastrado com sucesso");
            statement.execute(sqlInsert4);
            logger.info("Funcionário 4 cadastrado com sucesso");
            statement.execute(sqlInsert5);
            logger.info("Funcionário 5 cadastrado com sucesso");
            statement.execute(sqlInsert6);
            logger.info("Funcionário 6 cadastrado com sucesso");

        } catch (JdbcSQLIntegrityConstraintViolationException error) {
            logger.error("Chave primária repetida");
        } catch (Exception error) {
            logger.error("Ocorreu um erro");
            error.printStackTrace();
        } finally {
            statement.execute(sqlDelete);
            logger.info("Funcionário deletado com sucesso");

            statement.execute(sqlUpdate);
            logger.debug("Funcionário atualizado com sucesso");

            statement.execute(sqlDelete2);
            logger.info("Funcionário deletado com sucesso");

            if (connection != null) {
                connection.close();
            }
        }
    }

    public static Connection getConnection() throws Exception{
        //Conexão com o Banco de dados:
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

    }
}