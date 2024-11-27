package byun618.hello_spring.domain.comment

import byun618.hello_spring.domain.AuditingEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "Comment")
class Comment(
    content: String
) : AuditingEntity() {
    @Column(name = "content", nullable = false)
    var content: String = content
        protected set
}