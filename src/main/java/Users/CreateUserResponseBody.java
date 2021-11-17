package Users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponseBody {
    private String id;
    private String createdAt;
    public int statusCode;

}
