package Test.Test_Connection.Models;
import javax.persistence.*;

@Entity
@Table(name = "SENSOR")
public class Sensor {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false,length = 255)
    private String temp;
    @Column(nullable = false,length = 255)
    private String hum;

    public void sensor(){}

    public void sensor(String temp,String hum){
        this.temp = temp;
        this.hum = hum;
    }

    public long getId(){
        return id;
    }

    public String gettemp(){
        return temp;
    }

    public void settemp(String temp){
        this.temp = temp;
    }

    public String getHum(){
        return hum;
    }

    public void setHum(String hum){
        this.hum = hum;
    }
}
