# 제네릭(Generic)을 이용하여 ArrayList와 비슷한 Class 만들기

#### 제네릭이란 클래스 내부에서 사용할 데이터 형식을 정해주는 것을 뜻한다. 기호는 T를 쓰지만 다른 문자도 상관 없음
```java
public class ArrList<T> {
	public T anyType;
}
```

### 배운 것
1. java에서는 제네릭에 대한 배열을 만들 수가 없다.
```
private T[] storageArray = new T [10];
```
위에 처럼 쓰면 에러가 뜬다. 따라서 다음과 같이 casting을 하거나 아예 변수 설정을 할 때 T가 아닌 object으로 쓸 수도 있다.
```java
private T[] storageArray = (T[]) new Object [10];
//또는
private Object[] storageArray = new Object [10];
```
