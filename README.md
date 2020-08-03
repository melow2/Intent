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
