

## 설명
Enum ADD, REMOVE, CLEAN, QUIT, INVALID등을 통해 
입력 명령어를 구분한다.  
구분한 명령어에 맞는 동작을 한다.  

## **입력**

모든 명령어들은 case insensitive 하다.  
ADD **[String]**  
REMOVE **[String]**  
CLEAN  
QUIT  
그 외의 입력은 INVALID COMMAND로 처리된다.  

## **입출력 예**

add Hello  
***Element Size: 1, Values = [Hello]***  
Add Java  
***Element Size: 2, Values = [Hello, Java]***  
add hello  
***Element Size: 3, Values = [Hello, Java, hello]***  
aDD Java  
***Element Size: 3, Values = [Hello, Java, hello]***  
remove Hello  
***Element Size: 2, Values = [Java, hello]***  
remove java  
***Element Size: 2, Values = [Java, hello]***  
add Good  
***Element Size: 3, Values = [Java, hello, Good]***  
remove Java  
***Element Size: 2, Values = [hello, Good]***  
clean  
***Element Size: 0, Values = []***  
add PNU  
***Element Size: 1, Values = [PNU]***  
add is  
***Element Size: 2, Values = [PNU, is]***  
add Wonderful  
***Element Size: 3, Values = [PNU, is, Wonderful]***  
quit  
***BYE!***  
