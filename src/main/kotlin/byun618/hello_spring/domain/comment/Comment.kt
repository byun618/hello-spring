package byun618.hello_spring.domain.comment

import byun618.hello_spring.domain.AuditingEntity
import byun618.hello_spring.domain.member.Member
import byun618.hello_spring.domain.post.Post
import jakarta.persistence.*

@Entity
@Table(name = "Comment")
class Comment(
    content: String,
    post: Post
) : AuditingEntity() {
    @Column(name = "content", nullable = false)
    var content: String = content
        protected set

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Post::class)
    var post: Post = post
        protected set
}