package byun618.hello_spring.config

import byun618.hello_spring.domain.member.Member
import byun618.hello_spring.domain.member.MemberRepository
import byun618.hello_spring.domain.member.Role
import io.github.serpro69.kfaker.faker
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.EventListener

@Configuration
class InitData(
    private val memberRepository: MemberRepository
) {
    val faker = faker { }

    @EventListener(ApplicationReadyEvent::class)
    private fun init() {
        val member = Member(
            email = faker.internet.safeEmail(),
            password = "1234",
            role = Role.USER
        )

        memberRepository.save(member)
    }
}