package flashvagon.kata.pp312.model.request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
}
