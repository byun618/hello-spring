package byun618.hello_spring.api

import byun618.hello_spring.domain.member.Member
import byun618.hello_spring.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(private val memberService: MemberService) {
    @GetMapping("/members")
    fun findAll(): MutableList<Member> {
        return memberService.findAll()
    }
}