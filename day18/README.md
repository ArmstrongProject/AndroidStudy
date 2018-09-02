Day17 BroadCastReceiver & 위험권한부여
======================================

--------------------------------------
# Day17
## 20180819 20:00~22:10 (4명)
### BroadcastReceiver 실습 , 위험권한부여 실습

* _BroadcastReceiver_
    * BroadcastReceiver는 onReceive Callback 함수를 통해 호출 된다.
    * Intent-filter에 Action을 등록 후 해당 Intent를 처리한다.
    * 필요할 경우 권한을 부여받아야 Broadcast를 수신할 수 있다.
* _위험권한부여_
    * 보안정책에 따라 마시멜로우 이후 부터 위험요소에 따라 권한 요청을 해야함
    * 권한이 있는지 확인 후 권한을 요청할 수 있다.
* _차주 학습_
    * Chapter3 예제 실습 예정
