# 스타크래프트 영웅 디펜스

<img src="https://ww.namu.la/s/abc940a8e5fd007f5f64583c302aee153efc65a1a2419e19d9f44e14b76d02b34eb646cf939a77d6129c5a8b886ce5d113c1b632cb80c26bff79f3f366483cfc55bf5729dcabea53fd26710efac75ead521adfc02469aa4b759f9729627c8b6a">

> **한정된 자원으로 Unit 생성하여 상대 영웅 Unit을 제거하는 Console 게임이다.**  

</br></br>
객체지향 개념이 무슨 느낌인지 알겠는데 직접 안해보면 평생 느낌만 알 것 같아서 진행한 프로젝트입니다!
</br>

아래는 설계 및 구현하는데 있어 도움을 받은 글입니다.
- https://github.com/jojoldu/oop-java
- https://okky.kr/article/358197
</br></br>

## 0. 설계 원칙
- 메시지(행위)를 중심으로 설계한다.
- 상세하게 지시 하지 않고 요청한다.
- 하나의 메서드는 하나의 일만 해야한다.
</br></br>

## 1. 게임 규칙
- Player의 종족은 테란이다.
- 스테이지 마다 자원이 주워진다.
- 한정된 자원으로 Unit을 생성할 수 있다.
- 생성된 Unit의 능력치(공격력, 방어력)를 업그레이드 할 수 있다.
- Unit을 생성한 후 게임을 시작한다.
- 생성한 Unit이 적의 영웅을 제거하면 다음 스테이지로 넘어간다.
- 살아남은 Unit은 그대로 Save되어 다음 스테이지에서 사용할 수 있다.
- 스테이지의 레벨은 10단계이며 스테이지를 모두 Clear하면 게임은 종료된다.
- 적에게 패배하면 게임은 종료된다.
</br></br>

## 2. 화면
### 2-1. 초기 메인 메뉴
<img src = "image/초기 메인 메뉴.png">
</br></br>

### 2-2. 유닛 생산 메뉴
<img src = "image/유닛 생산 메뉴.png">
</br></br>

### 2-3. 유닛 능력치 업그레이드 메뉴
<img src = "image/유닛 능력치 업그레이드 메뉴.png">
</br></br>

### 2-4. 전투 메뉴 및 전투 화면
<img src = "image/전투 메뉴 및 전투 화면.png">
</br></br>

### 2-5. 게임 종료 화면
<img src = "image/게임 종료 화면.png">
</br></br>


## 3. 클래스 목록 및 설명
<img src = "image/클래스파일 목록.png">
</br></br>

### 3-1. Application.java
- 게임을 실행시키기 위한 클래스

### 3-2. Game.java
- 실제로 게임을 진행시키는 클래스

### 3-3. Stage.java
- Unit과 영웅간에 전투를 벌이는 클래스

### 3-4. Exchage.java
- 게이머와 건물간(생산 및 업그레이드) 거래를 담당하는 거래소 클래스
- 거래는 주문서(Order)를 통해 이뤄진다.
- 주문서는 원하는 품목과 현재 게이머가 가지고 있는 자원 상태를 갖는다.
- 게이머의 자원이 충족하다면 거래소는 건물에서 품목을 받아 게이머에게 전달한다.

### 3-5. Order.java
- 게이머가 Unit 생산 혹은 Unit의 능력치 업그레이드를 위해 원하는 품목과 현재 가지고 있는 자원을 표기하는 클래스
- Order는 추상 클래스로 UnitOrder, TrainingBuilding가 상속받는다.

### 3-6. Unit.java
- 모든 Unit의 조상 클래스

### 3-7. UnitBuilding.java
- Unit 생산 건물의 조상 클래스
- Barracks, Factory, Starport가 상속받는다.

### 3-8. TrainingBuilding.java
- Unit 능력치 업그레이드 건물의 조상 클래스
- EngineeringBay, Armory가 상속받는다.

### 3-9. Player.java
- Gamer와 Enemy의 조상 클래스
- Gamer는 유저 역할을 하며 Enemy는 상대 역할을 한다.


