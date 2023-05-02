# Spring 공부 일지

## 스프링 웹

- 정적 컨텐츠
- MVC와 템플릿 엔진
- API
  - `@ResponseBody` 어노테이션을 사용하면 return 하는 값에 따라 `HttpMessageConverter`가 알아서 처리
  - 클라이언트의 Accept 헤더 등 서버의 컨트롤러 반환 타입 정보를 섞어서 적절한 `HttpMessageConverter`가 선택됨