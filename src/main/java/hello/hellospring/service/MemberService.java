package hello.hellospring.service;

import hello.hellospring.entity.Member;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class MemberService {
//    public Member getMember(Long memberId) {
//        return memberRepository.findById(memberId).orElseThrow(() ->
//                new RestClientException("NOT FOUND"));
//    }

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Optional<Member> getMember(Long id) {
        return memberRepository.findById(id);
    }
}
