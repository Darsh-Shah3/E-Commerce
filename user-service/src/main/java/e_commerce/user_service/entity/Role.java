package e_commerce.user_service.entity;

import java.util.UUID;

import e_commerce.user_service.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID role_id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private UserRole name;

    @Column(length = 255)
    private String description;

    public Role(UserRole name) {
        this.name = name;
    }
}
