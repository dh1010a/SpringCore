package hello.core.member;


import hello.core.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberServiceTest {

	MemberService memberService;

	@BeforeEach
	public void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
	}

	@Test
	public void join() {
	    //given
		Member member = new Member(1L, "memberA", Grade.VIP);
	    //when
		memberService.join(member);
		Member findMember = memberService.findMember(1L);
		//then
		assertEquals(member, findMember);
	}
}
