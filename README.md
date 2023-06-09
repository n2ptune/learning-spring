# Spring 공부 일지

## 스프링 웹

- 정적 컨텐츠
- MVC와 템플릿 엔진
- API
  - `@ResponseBody` 어노테이션을 사용하면 return 하는 값에 따라 `HttpMessageConverter`가 알아서 처리
  - 클라이언트의 Accept 헤더 등 서버의 컨트롤러 반환 타입 정보를 섞어서 적절한 `HttpMessageConverter`가 선택됨

## 스프링 백엔드 개발

- 도메인
  - 비즈니스 도메인 객체
- 레포지터리
  - 도메인 객체를 DB에 저장, 데이터베이스에 접근
- 서비스
  - 핵심 비즈니스 로직
- 컨트롤러
- 테스트
  - 자바의 `main` 메서드를 통해서 어플리케이션을 실행 후 컨트롤러를 통해 구현한 로직에 대해 테스트 한다. 이러한 방법은 반복적으로 실행하기 어렵고, 오래 걸리며 여러 테스트를 한번에 실행하기 불편하다는 단점이 있어 `JUnit` 이라는 프레임워크를 사용한다.
  - 테스트는 순서간 의존성이 없어야하며 공유 객체의 경우 `AfterEach` 등 어노테이션을 통해 테스트가 실행 되기 전 혹은 되고나서 공유 객체를 초기화 해야 한다.
- 데이터베이스 연동
  - JDBC
    - 백엔드 어플리케이션과 DB의 연결다리 같은 녀석
    - 추상 API를 제공하고 그 API를 구현한 구현체가 JDBC 드라이버라고 부른다.
  - JPA
    - ORM 기술 표준을 사용하기 위한 인터페이스 집합
    - JPA를 구현한 오픈소스로 Hibernate가 있고 제일 유명하다고 함
    - Entity(테이블) 구조를 자바 코드로 직접 작성하고 테이블에 대한 메타데이터를 어노테이션 및 클래스 작성으로 가능하게끔 하는듯 (자바스크립트의 TypeORM이랑 비슷한듯)
  - MyBatis
    - 얘도 ORM인데 뭔가 SQL을 직접 작성하는 듯한 특징이 JPA와의 차이점인듯 함
    - xml로 mapper를 작성? 뭔가 해줘야되는 것이 많나보다