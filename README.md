# 🌈 Android Study week 10 목표 🌈
made by [bmsk](https://github.com/YiBeomSeok)

## 🛸 git
- git 사용이 익숙해졌다면 git flow 전략을 참고한다.
- 주어진 `feature/1-main-activity`를 clone 후 아래 branch name에 해당하는 branch로 checkout해서 수행하도록 한다.
- 명령어 예시
```shell
git clone --branch feature/1-main-activity <주소>
git checkout -b <branch명>
```

## 🛸 branch name 목록
- main
- develop
- feature/1-main-activity
- feature/2-maddy-activity
- feature/3-wbham-activity
- feature/4-Jaeeepp-activity
- feature/5-Arr-activity

## 🛸 최종 branch

### ***main branch***
- main branch를 직접 수정하지 않도록 주의한다.
- develop branch에서의 모든 작업이 끝났을 때 pull request를 통해 수정된다.

### ***develop branch***
- develop branch를 직접 수정하지 않도록 주의한다.
- branch로의 merge는 pull request로 진행한다.

## 🛸 feature branch

### 공통 요구 사항
- 그 외 다른 branch에서 작업하는 기능을 수정하지 않도록 주의한다.
- 클래스 명, 함수 명, 변수 명 등 그 이름을 읽었을 때 어떤 기능을 하는 것인지 유추할 수 있게끔 노력한다.

### ***feature/1-main-activity***
- `MainActivity`에서 다른 `Activity`로 전환할 수 있도록 구현한다.

made by [bmsk](https://github.com/YiBeomSeok)

### ***feature/2-maddy-activity***
- UMC standard mission week9 내용을 구현한다.
- 함수 길이가 너무 길어지지 않도록 주의한다.

made by [Maddy](https://github.com/MADElinessss)

### ***feature/3-wbham-activity***
- UMC standard mission week9 내용을 구현한다.
- 어떤 fragment A에서 `thread`를 실행하고 그 `thread`가 종료되지 않은 시점에 다른 fragment B로 전환될 때 그 `thread`의 현재 진행 상황을 `Log.d`로 출력한다.

made by [wbham](https://github.com/WooBinHam)

### ***feature/4-Jaeeepp-activity***
- UMC standard mission week9 내용을 구현한다.
- retrofit2 사용시 `Log.d`로 진행 상황을 출력한다.
  - TAG: GET or POST

made by [jaeeepp](https://github.com/Jaeeepp)

### ***feature/5-Arr-activity***
- UMC standard mission week9 내용을 구현한다.
- 크기가 큰 데이터를 받아올 수 있다면 `MAP`으로 담고 특정 `key`에 해당하는 `value`를 `Log.d`로 출력 또는 text로 구현한다.

made by [Arr](https://github.com/LeeGa00)

## ✍ Commit convention
commit message는 다음과 같이 작성하도록 한다.
- 기능 구현: `[FEAT] 변경 내용(추가된 클래스명, 추가된 함수명 등등)`
- 버그 수정: `[FIX] 변경 내용`
- 테스트: `[TEST] 테스트 코드 내용`
- 리펙토링: `[REFACTOR] 어떤 개선을 위한 변경인지 설명`
- 그 외는 자유롭게 작성하되 간단 명료하게 작성한다.
