package hello.hellospring.repository;

import hello.hellospring.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemberRepository extends JpaRepository<Member, Long> {
}