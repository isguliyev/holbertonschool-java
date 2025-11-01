import java.sql.DriverManager;
import java.sql.Driver;
import java.util.Enumeration;

public class PrintJDBCDrivers {
    public static void main(String[] args) {
        Enumeration<Driver> enumeration = DriverManager.getDrivers();
        Driver driver = null;

        while (enumeration.hasMoreElements()) {
            driver = enumeration.nextElement();
            System.out.printf("%s %d.%d\n",
                driver.getClass().getName(),
                driver.getMajorVersion(),
                driver.getMinorVersion());
        }
    }
}