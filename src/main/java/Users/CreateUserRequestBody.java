package Users;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Builder
public class CreateUserRequestBody {
    private String name;
    private String job;

}
