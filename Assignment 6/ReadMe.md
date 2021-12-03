 
## 설명  

Enum ADD, FIND, CLEAR, LIST, QUIT, INVALID등을 통해
입력 명령어를 구분한다.  
  
Student 클래스에는 equals, hashCode, toString등이 오버라이딩 되어있고,  
School 클래스에는 toString이 오버라이딩 되어있다.  
  
GenericList<T>를 사용한다.  

##  **입력**  

ADD **[이름] [학년]**  
FIND **[이름] [학년]**  
CLEAR  
LIST  
QUIT  
그 외의 입력은 INVALID COMMAND로 처리된다.  
  

##  **입출력 예**  
  

***Enter Command String!*** add James 1  
***Enter Command String!*** list  
***School Name: PNU Student Count: 1  
[James, 1학년]***  
***Enter Command String!*** add Brouwn 2  
***Enter Command String!*** list  
***School Name: PNU Student Count: 2  
[James, 1학년][Brouwn, 2학년]***  
***Enter Command String!*** find James 1  
***[James, 1학년]***  
***Enter Command String!*** find james 1  
***Student Not Found with name james and year 1***  
***Enter Command String!*** clear  
***Enter Command String!*** list  
***School Name: PNU Student Count: 0***  
  
***Enter Command String!*** find James 1  
***Student Not Found with name James and year 1***  
***Enter Command String!*** quit  
***Bye***  
