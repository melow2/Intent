# Intent
안드로이드 Intent에 대한 설명.<br/>
- 이메일: melow2@naver.com

## Concept
액티비티 전환시 정보를 전달하는 목적으로 만들어진 장치.

**1. 명시적 인텐트**
* 호출 대상이 정해져 있는 경우.
    * **예) SecondActivity로 명확한 intent의 목적이 명시되어 있을 때.**
```
Intent intent = new Intent(MainActivity.this,SecondActivity.class); // 컨텍스트,호출할 액티비티
startActivity(intent)
```

**2. 암시적 인텐트**
* 호출 대상이 정해지지 않은 경우.
    * **예) 다음 작업을 수행할 브라우저를 선택하세요.**
    * MainActivity에서는 website를 열어라고 intent만 던진다.
    * 호출 대상을 알아서 선택해야하는 문제.
```
mBinding.btnDial.setOnClickListener {
    uri = Uri.parse("tel:01049307013")
    intent = Intent(Intent.ACTION_DIAL,uri)
    startActivity(intent)
}

mBinding.btnCall.setOnClickListener {
    uri = Uri.parse("tel:01049307013")
    intent = Intent(Intent.ACTION_CALL,uri)
    startActivity(intent)
}

mBinding.btnContact.setOnClickListener {
    uri = Uri.parse("content://contacts/people/");
    intent = Intent(Intent.ACTION_VIEW,uri)
    startActivity(intent)
}

mBinding.btnWebsite.setOnClickListener {
    uri = Uri.parse("http://sba.seoul.kr")
    intent = Intent(Intent.ACTION_VIEW, uri)
    startActivity(intent)
}

mBinding.btnSms.setOnClickListener {
    intent = Intent(Intent.ACTION_VIEW);
    intent?.putExtra("sms_body", "문자 메시지 입니다.");
    intent?.setType("vnd.android-dir/mms-sms");
    startActivity(intent)
}
```
