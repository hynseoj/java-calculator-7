# java-calculator-precourse

# 문자열 덧셈 계산기

> 사용자가 입력한 문자열에서 구분자를 기준으로, 숫자를 추출하여 더하는 계산기 프로그램

## 🚀 기능 목록

- [ ] 사용자는 콘솔을 통해 문자열을 입력할 수 있다.
    - 빈 문자열이 입력된 경우 `IllegalArgumentException`을 발생시키고, 애플리케이션을 종료한다.
- [ ] 입력은 **구분자**와 **양수**로 구성된다.
    - 기타 특수문자와 음수 및 0 이 입력된 경우 `IllegalArgumentException`을 발생시키고, 애플리케이션을 종료한다.
- [ ] 기본 구분자는 쉼표(`,`)와 콜론(`:`) 이다.
- [ ] 사용자는 기본 구분자 외에 커스텀 구분자를 지정할 수 있다.
    - 문자열 앞부분에서 `//`와 `\n` 사이에 위치하는 문자를 커스텀 구분자로 지정한다.
- [ ] 프로그램은 구분자를 기준으로, 입력 문자열에서 숫자를 추출한다.
- [ ] 프로그램은 추출한 각 숫자의 합을 출력한다.

## 🪧 프로그램 실행 예시

```text
덧셈할 문자열을 입력해 주세요.
1,2:3
결과 : 6
```