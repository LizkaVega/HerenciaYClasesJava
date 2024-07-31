import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Empleado extends personas

{
    private String rol;
    private int HourJop;
    private float salary;
}
