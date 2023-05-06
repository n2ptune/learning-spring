package hello.hellospring.service;

import hello.hellospring.entity.Member;
import hello.hellospring.repository.JpaMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

@Service
public class MemberService {
    @Autowired
    private JpaMemberRepository memberRepository;

    public Member getMember(Long memberId) {
        return memberRepository.findById(memberId).orElseThrow(() ->
                new RestClientException("NOT FOUND"));
    }
}
