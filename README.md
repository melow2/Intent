# Intent
안드로이드 Intent에 대한 설명.<br/>
- 이메일: melow2@naver.com

## Concept
액티비티 전환시 정보를 전달하는 목적으로 만들어진 장치.

#### 사용방법
1. 인텐트 객체 생성.
2. 호출 메소드 이용하여 액티비티 호출.
```
Intent intent = new Intent(MainActivity.this,SecondActivity.class); // 컨텍스트,호출할 액티비티
startActivity(intent)
```

## 종류
1. 명시적 인텐트
 * 호출 대상이 정해져 있는 경우.(*명확하게 호출 대상이 정해져 있는 경우)

2. 암시적 인텐트
 * 호출 대상이 정해지지 않은 경우.
 * **예) 다음 작업을 수행할 브라우저를 선택하세요.**
 * MainActivity에서는 website를 열어라고 intent만 던진다.
