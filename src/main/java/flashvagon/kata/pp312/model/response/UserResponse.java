package flashvagon.kata.pp312.model.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserResponse {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
}
