package Test.Test_Connection;
import Test.Test_Connection.Models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDao extends JpaRepository<Sensor,Long> {
}
