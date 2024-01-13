package proiect.Micunelte;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private UUID id;

    private String name;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String deliveryAddress;
    private String carRegistrationNumber;

    private Role role;
}
