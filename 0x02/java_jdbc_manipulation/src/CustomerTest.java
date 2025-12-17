// javac -cp "sqlite-jdbc-3.51.1.0.jar" -d target *.java
// java -cp "target:sqlite-jdbc-3.51.1.0.jar" CustomerTest

public class CustomerTest {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sqlite_database_marco_2022.db";

        CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
        customerDAOImpl.connect(url);

        customerDAOImpl.createTable(url);

        Customer customer1 = new Customer();
        customer1.setName("Danilo R. Pereira");
        customer1.setAge(37);
        customer1.setCpf("111.111.111-11");
        customer1.setRg("222.222.222-22");

        Customer customer2 = new Customer();
        customer2.setName("Joao Oliveira Silva");
        customer2.setAge(55);
        customer2.setCpf("888.111.111-11");
        customer2.setRg("777.222.222-22");

        customerDAOImpl.insert(url, customer1);
        customerDAOImpl.insert(url, customer2);

        customerDAOImpl.selectAll(url);

        customerDAOImpl.update(url, 1, "Danilo Rodrigues Pereira", 38);
        customerDAOImpl.selectAll(url);

        customerDAOImpl.delete(url, 2);
        customerDAOImpl.selectAll(url);
    }
}