# 미션 - 자동차 경주 게임

### 🎯 구현할 기능 목록

#### 사용자

- [x] 사용자는 쉼표(,)를 기준으로 자동차 이름을 입력한다.
    - [x] [ERROR] 자동차 이름의 길이가 `5보다 크거나` `공백`이면 IllegalArgumentException 를 발생시키고, 에러 메시지를 출력 후 그 부분을 다시 입력 받는다.
    - [x] [ERROR] 자동차 이름이 `중복`이면 IllegalArgumentException 를 발생시키고, 에러 메시지를 출력 후 그 부분을 다시 입력 받는다.
- [x] 사용자는 자동차를 몇 번 이동을 할 것인지 숫자를 입력한다. 
    - [x] [ERROR] 숫자가 아닌 `문자를 입력`하면 IllegalArgumentException 를 발생시키고, 에러 메시지를 출력 후 그 부분을 다시 입력 받는다.
    - [x] [ERROR] `0이하의 숫자`를 입력하면, IllegalArgumentException 를 발생시키고, 에러 메시지를 출력 후 그 부분을 다시 입력 받는다.

#### 자동차

- [x] 사용자가 입력한 자동차 이름 수 만큼 자동차가 생성된다.
- [x] 무작위 값이 4 이상일 경우, 자동차는 전진한다.
- [x] 무작위 값이 4 미만일 경우, 자동차는 멈춘다.

#### 프로그램

- [x] 프로그램은 무작위 값을 생성한다. (0 ~ 9)

#### 종료

- [x] 사용자가 입력한 횟수만큼 이동을 했다면, 게임을 종료한다.
- [x] 우승자를 구한다. 단, 가장 멀리 이동한 자동차가 여러명일 경우 쉼표(,)를 이용하여 구분한다.

### ✅ 확인할 목록

- [x] 메소드의 길이가 `15라인`을 넘어가지 않도록 구현한다.
    - 메소드가 한 가지 일만 잘 하도록 구현한다.
- [x] `else`, `switch/case` 예약어를 사용하지 않는다.
    - if 조건절에거 값을 return 하는 방식으로 구현하면 else 를 사용하지 않아도 된다.
- [x] Car `기본 생성자`를 추가할 수 없다.
- [x] Car 클래스의 접근 제어자인 `private`을 변경할 수 없다.
- [x] 가능하면 setPosition(int position) 메소드를 추가하지 않고 구현한다.
- [x] `camp.nextstep.edu.missionutils`에서 제공하는 `Randoms`, `Console` API 를 활용해 구현해야 한다.
    - [x] Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()`를 활용한다.
    - [x] 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.
