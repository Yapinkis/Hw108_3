package model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="name", nullable = false, length = 255)
    private String name;
    @Column(name ="email", nullable = false, length = 255, unique = true)
    private String email;
    @Column(name ="age", nullable = false)
    @Min(8) @Max(99)
    private Integer age;
    @Column(name ="created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
