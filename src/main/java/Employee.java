import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Data
@AllArgsConstructor
@ToString
public class Employee
{

        private Integer id;
        private String name;
        double salary,rating;
}
