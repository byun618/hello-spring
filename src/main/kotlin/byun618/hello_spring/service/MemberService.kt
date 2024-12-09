package byun618.hello_spring.service

import byun618.hello_spring.domain.member.Member
import byun618.hello_spring.domain.member.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    @Transactional(readOnly = true)
    fun findAll(): MutableList<Member> = memberRepository.findAll()
}