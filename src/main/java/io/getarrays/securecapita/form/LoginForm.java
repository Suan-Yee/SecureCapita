package io.getarrays.securecapita.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @author Junior RT
 * @version 1.0
 * @license Get Arrays, LLC (https://getarrays.io)
 * @since 12/25/2022
 */

@Data
public class LoginForm {
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
}
