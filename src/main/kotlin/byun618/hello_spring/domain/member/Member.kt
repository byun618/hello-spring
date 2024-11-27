package byun618.hello_spring.domain.member

import byun618.hello_spring.domain.AuditingEntity
import jakarta.persistence.*

@Entity
@Table(name = "Member")
class Member(
    email: String,
    password: String,
    role: Role
): AuditingEntity() {
    @Column(name = "email", nullable = false)
    var email: String = email

    @Column(name = "password", nullable = false)
    var password: String = password

    @Enumerated(EnumType.STRING)
    var role: Role = role
}

enum class Role {
    USER, ADMIN
}