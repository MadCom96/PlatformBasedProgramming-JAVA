

## 설명
Enum ADD, LIST, SUM, MAX, MIN, INVCOM 등을 통해 
입력 명령어를 구분한다.  
구분한 명령어에 맞는 동작을 한다.

## **입력**

모든 명령어들은 case insensitive 하다.  
ADD **[int]**  
LIST  
SUM  
MAX  
MIN  
그 외의 입력은 INVALID COMMAND로 처리된다.  

## **입출력 예**

ADD 10  
add 20  
LIST  
***10 20***  
Sum  
***30***  
Add 30  
suM  
 ***60***  
Max  
***30***  
Min  
***10***  
Summ  
***Invalid Command***  
list  
***10  20 30***  
Quit  
***Bye!***
