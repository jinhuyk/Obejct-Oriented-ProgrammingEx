# Object-Oriented Programming
## 학습 목적

Java Programming에서 배우게 된 OOP가 다른 프로그래밍 언어에서는 어떤 방식으로 작동하는지 알아보기 위해 객체 지향 프로그래밍을 지원하는 Java, Python, C++에서의 똑같은 형식을 구현해보았다.

## 학습 기간

2022.12.31 - 

## 학습 참고자료

- 혼자 공부하는 자바 (한빛미디어)
- C++ 트레이닝 (한빛 아카데미)
- 실용 파이썬 프로그래밍 (위키독스)
- 객체지향의 사실과 오해 (위키북스)

## 학습 내용

### 객체지향 프로그래밍이란

- **객체의 정의**
    
    > 객체는 상태(state)와 행동(behavior)을 함께 지닌 실체라고 정의된다. - 객체지향의 사실과 오해
    > 
    
    객체는 기본적으로 필드와 메소드를 가지고 있고, 필드는 속성을, 메소드는 동작을 의마한다.
    
- **객체의 특성**
    - 객체는 상태를 가지며 상태는 변경 가능하다.
    - 객체의 상태를 변경 시키는 것은 객체의 행동이다.
        - 행동의 결과는 상태에 의존적이며, 상태를 이용해 서술할 수 있다.
        - 행동의 순서가 실행 결과에 영향을 미친다.
    - 객체는 어떤 상태에 있더라도 유일하게 식별 가능하다.
- **객체지향 설계 기법**
    - **책임 주도 설계 (Responsibility-Driven Design)**
	책임 주도 설계란 객체의 책임을 중심으로 시스템을 구축하는 것을 말한다.
		시스템의 기능은 계속해서 작은 규모의 책임으로 분할되고, 그 책임들을 그것을 수행할 	적절한 객체에 할당이 된다.  이는 객체가 처리할 수 없는 정보나 기능은 그것을 가지고 있는 적절한 객체로 찾아 필요한 작업을 요청하는 것을 말한다. 다음과 같은 방식으로, 객체들은 서로 협력을 하게 되는 것이다. 
        - What/Who 사이클
        What/Who 사이클이란 객체 사이의 협력 관계를 설계하기 위해 먼저 어떤 행위를 수행할 것인지, 누가 그 행위를 수행할 것인지 결정해야한다는 것이다. 즉 위에서 말했던 객체가 메시지를 받았을 때 처리할 수 없는 정보나, 기능들은 그것을 수행할 수 있는 적절한 객체로 찾아야한다는 것을 이용한다는 것이다. 즉 행위를 먼저 식별하고, 그것을 수행할 객체를 찾는다. 
    - **디자인 패턴(Design Pattern)**
    디자인 패턴은 책임-주도 설계의 결과를 표현하는 것으로, 아무것도 없는 상태에서 작업을 시작하는 것이 아닌, 이전의 결과물을 모방하고, 수정을 거쳐 원하는 결과물을 만들어 내는 것이다. 
    즉, 하나의 템플릿 같은 역할을 하는것이다. 이에 많은 디자인 패턴들을 숙지 해 놓는 것이, 더 빠르고, 좋은 결과물을 만들 수 있다.
    - **테스트-주도 개발(Test-Driven Development)**
    테스트 주도 개발이란 테스트를 작성하는 것이 아닌, 책음을 수행할 객체 또는 클라이언트가 기대하는 객체의 역할이 메시지를 수신할 때 어떤 결과를 반환하고 그 과정에서 어떤 객체와 협력할 것인지에 대한 기대를 코드의 형태로 작성하는 것이다.
    사실 이부분에서 무슨 말인지 이해가 되지 않았는데, 구글링을 통해 찾아보니 다음과 같은 말이었다. 프로그래밍을 할때, 처음부터 코드를 모두 작성하는 것이 아닌, 원하는 결과물에 대한 것들을 작성해놓고, 그리고 그 원하는 것에 맞게 코드를 작성하는것이다.
    [테스트-주도 개발 이해](http://clipsoft.co.kr/wp/blog/tddtest-driven-development-%EB%B0%A9%EB%B2%95%EB%A1%A0/)
- **다형성**
다형성이란 서로 다른 유형의 객체가 동일한 메시지에 대해 서로 다른게 반응하는 것이다.
- **클래스보다는 메시지를 중심으로**
객체지향의 사실과 오해에서는 객체지향이 클래스를 기준으로 프로그래밍을 된다라기 보다는, 객체들의 메시지가 객체지향의 핵심이라고 설명한다. 
처음 객체지향 프로그래밍을 접하기 전에는 사실 객체지향 프로그래밍에서 구현할 수 있는 것들은 굳이 클래스를 나누지 않고도 코드를 작성할 수 있었다. 즉 클래스는 단지 그런 코드들을 잘 사용할 수 있게 만드는 하나의 도구이고, 객체들이 주고받는 메시지를 중심으로, 어떤식으로 작성할지가 더 중요하다는 것을 책을 읽으면서 알게 되었다.
- **캡슐화**
객체는 자신의 상태를 관리하고, 행동들을 객체 내부에 함꼐 보관한다. 이런 것을 캡슐화 라고 하는데, 객체는 이런 것을 외부에서 반드시 접근해야만 하는 것들만 골라서 노출시킨다. 

![예제](https://velog.velcdn.com/images/jinhuyk/post/9fddc424-6f72-44b8-bece-ef0c124cd056/image.png)
다음 사진은 객체지향의 사실과 오해에서 나온 예제를 가져온 것이고, 다음 예제를 직접 Java, Python, C++에서 구현을 해보았다.

![다음 예제를 모델링](https://velog.velcdn.com/images/jinhuyk/post/21b7f553-2cf1-47ad-a916-811da671153a/image.png)
일단 다음처럼 간단하게 객체별로 작성할 수 있다. 
### JAVA에서의 OOP
1. 기본적으로 클래스와 필요한 메시지를 작성해준다.
```java
class Customer {
	public void order(String menuName) {
		
	}
}
class MenuItem{

	
}
class Menu{
	public MenuItem chooseCoffee(String name) {
	}
	
}
class Barista {
	public Coffee makeCoffee(MenuItem menuitem) {
	}
	
}
class Coffee {
	public Coffee(MenuItem menuItem) {
	}
}

```
이후 세부사항을 작성한다.
```java
class Customer {
	// menuItem과 barista에 대한 객체 접근
	public void order(String menuName, Menu menu, Barista barista) {
		MenuItem menuItem = menu.chooseCoffee(menuName);
		Coffee coffee = barista.makeCoffee(menuItem);
	}
}
class MenuItem{
	private String name;
	private int price;
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	
}
class Menu{
	private List<MenuItem> items;
	public Menu(List<MenuItem> items) {
		this.items = items;
	}
	
	// 커피 고르기
	public MenuItem chooseCoffee(String name) {
		for(MenuItem item : items) {
			if(item.getName().equals(name)){
				return item;
			}
		}
		return null;
	}
	
}
class Barista {
	public Coffee makeCoffee(MenuItem menuitem) {
		Coffee coffee = new Coffee(menuitem);
		return coffee;
	}
	
}
class Coffee {
	private String name;
	private int price;
	public Coffee(MenuItem menuItem) {
		name = menuItem.getName();
		price = menuItem.getPrice();
	}
}
```
### Python 에서의 OOP
```python
class Customer:
    def order(menuName, menu, barista):
        menuItem = menu.chooseCoffee(menuName)
        coffee= barista.makeCoffee(menuItem)
class MenuItem:
    def __init__(self, name,price):
        self.__name = name
        self.__price = price
    def getName(self):
        return sef.__name
    def getPrice(self):
        return sef.__price
class Menu:
    def __init__(self, items):
        this.items = items
    def choooseCoffee(name):
        for item in items:
            if(item.name == name):
                return item
        return null
class Barista:
    def makeCoffee(menuitem):
        coffee = Coffee(menuitem)
        return coffee
class Coffee:
    def __init__(self, menuItem):
        self.__name = menuItem.name
        self.__price = menuItem.price
```
### C++ 에서의 OOP
> 공부를 해야한다

## 마무리
java programming을 수강하면서 객체 지향 프로그래밍의 기본적인 개념은 알게 되었지만, 헷갈리는 개념도 많았다. 그래서 이 객체지향의 사실과 오해를 읽으면서, 객체지향을 할때의 중요한 점과, 프로그래밍 방법등을 알게 되었다. 
다음에는 한번 객체지향에서의 여러가지 디자인패턴에 대해 공부해보면 좋을 것같다.
