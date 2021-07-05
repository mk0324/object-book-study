# 조영호 님의 책 오브젝트 북 스터디 저장소

## 1. 객체, 설계

티켓판매 어플리케이션

### 문제점

- Theater의 enter 메서드를 이해하기 위해서 Audience 가 Bag 을 가지고 있고, Bag 안에는 현금과 티켓이 들어 있으며
TicketSeller 가 TicketOffice 에서 티켓을 판매하고, TicketOffice 안에 돈과 티켓이 보관돼 있다는 모든 사실을 동시에 기억하고 있어야 한다.
(모든 책임이 Theater 에 몰려 있다)
  
  
```
하나의 클래스나 메서드에서 너무 많은 세부사항을 다루기 때문에 코드를 작성하는 사람뿐만 아니라 코드를 읽고 이해해야 하는 사람 모두에게 큰 부담을 지운다.
이런 코드를 변경에 취약한 코드라 볼 수 있다. 예상치 못한 변수에 대응하기 어려운 코드이다.
``` 

### 해결책 

- 객체 사이의 의존성과 관련된 문제로 정의할 수 있다. (의존성은 변경에 대한 영향을 의미한다) 
- 최소한의 의존성만 유지하고 불필요한 의존성을 제거해야 한다.
- 객체 내부의 상태를 캡슐화하고 객체 간에 메세지를 통해서만 상호작용하도록 한다.
```
결합도(Coupling)을 낮추고 변경에 용이한 설계로 변경한다.
밀접하게 연관된 작업만 수행하고 연관성 없는 작업은 다른 객체에게 위임하여 응집도를 높인다.
```

### 1장을 마무리 하며 - 좋은 설계란 무엇인가

- 요구하는 기능을 온전히 수행하면서 내일의 변경을 수용할 수 있는 설계다.
- 협력하는 개체 사이의 의존성을 적절하게 관리하는 설계이다.
- 코드를 수정하겠다는 마음이 들 수 있는 이해하기 쉬운 변경 가능한 코드를 작성해야 한다.
