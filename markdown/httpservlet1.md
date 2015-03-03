##一, servlet 的三种模式

### 1.1 实现servlet 接口
如果1个类要实现servlet接口.则要重写如下所有方法:

```java
 void	destroy()
          
 ServletConfig	getServletConfig()

 String	getServletInfo()

 void	init(ServletConfig config)
          
 void	service(ServletRequest req, ServletResponse res)
```

  **其中service方法是关键, 它决定了这个Servlet类获得http请求req的信息后做些什么, 返回什么信息到res对象中)**         
<br/>
<br/>

### 1.2 继承GenericServlet 抽象类.

实际上GenericServlet 这个抽象类本身是1个实现了servlet接口的抽象类, 只不过Servlet的程序猿按照默认情况帮你重写了上面5个方法中的4个,
但是关键的service()方法还是需要你字节写.

也就是讲GenericServlet的使用比上面的方法要更加方便了, 继承该类的Servlet类只需要重写1个方法(除构造方法外).


### 1.3 继承HttpServlet抽象类

但是上面两个方法都不是最常用的, 实际在软件公司工作工作中, 95%的情况下都会选择第3种情况, 就是继承HttpServlet抽象类.

HttpSerlvet也是1个实现了Servlet接口的抽象类.
继承抽象类HttpServlet的Servlet类要重写分别两个方法.

分别是

```java
doGet(HttpServletRequest request, HttpServletResponse response)

doPost(HttpServletRequest request, HttpServletResponse response)
```

上面两个方法都可以处理http请求和返回信息给webserver. 当然了, 它们实际上最终都是重写并调用了Servlet接口的service方法.

但是为什么要分开doGet和doPost呢.

其实doGet是用于处理浏览器的Get请求的.  也就是如果1个浏览器向webserver发起1个Get请求, webserver就会交由队对应servlet类的doGet()方法来处理

相对地, Post请求就会交由doPost()来处理.


## 二, 什么是Get请求和Post请求.
![p1](http://image16.poco.cn/mypoco/myphoto/20150220/23/444127020150220231734072.png?1024x508_120)

如上图, 我回了一个贴后,
见到浏览器向服务器发了很多个请求.

但是基本上都是Get请求, 只有1个Post请求, 但是那个Post请求包含了我回复的内容.

顾名思义,
Get请求就是浏览器向服务器申请内容的请求, Get information嘛.
而Post就是向浏览器提交数据的请求, 例如我想把我回复的内容发给服务器(回贴子).


但是上面两句话并不是绝对的. Get请求也可以提交数据.

**如果打开1个网址url, 那么这个请求肯定是1个Get请求**

**如果提交数据则不是绝对的**


<br/>
<br/>
它们取决于jsp的代码.

例如下面的就是利用Get请求来提交数据:
```html
<form action="/TestServlet1/MyServlet2" method="get">
```

而下面的代码就是利用post请求来提交数据:
```html
<form action="/TestServlet1/MyServlet2" method="get">
```

而默认情况下是Get请求. 例如:
```html
<form action="/TestServlet1/MyServlet2">
```


## 三, Get请求提交数据的1个例子.

下面我们写1个简单例子来熟悉一下HttpServlet的用法以及Get请求的特点.

### 3.1 新建1个web项目.
建议利用IDE, 更加方便


![p2](http://image16.poco.cn/mypoco/myphoto/20150220/23/444127020150220234045045.png?261x333_130)

### 3.2 servlet代码

我们编写1个Servlet类MyServlet2:
```java
package com.pkg1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet {
  private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.getOutputStream().println("It's call by doget()!");
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.getOutputStream().println("It's call by dopost()!");
  }

}
```

上面的doGet()　和　doPost()方法分别给浏览器返回不同的信息．　那么我们就可以通过浏览器内容来判断究竟执行了哪个方法．


### 3.3 编写index.jsp

我们在主页上写两个文本框,分别是用户名和密码．
还有１个submit按钮, 用于提交用户输入的用户名和密码啦．

代码：
```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test doGet and doPost</title>
</head>
<body>
  <form action="/TestServlet1/MyServlet2" method="post">
  Username:<input type="text" name="username"/>
  Password:<input type="text" name="password"/>
  <input type="submit" value="login"/>
  </form>
</body>
</html>
```

### 3.4 修改web.xml, 将servlet类和action url对应起来

添加:
```xml
  <servlet>
    <servlet-name>MyServlet2</servlet-name>
    <servlet-class>com.pkg1.MyServlet2</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>MyServlet2</servlet-name>
    <url-pattern>/MyServlet2</url-pattern>
  </servlet-mapping>
```
### 3.5 编译执行, 然后导出war包到tomcat 的webapps 文件夹, 启动tomcat, 然后在浏览器输入:`http:\\localhost:8080\TestServlet1\MyServlet2`<br/>

其中TestServlet1是项目名.

![p3](http://image16.poco.cn/mypoco/myphoto/20150221/10/44412702015022110170508.png?588x383_130)

如上图, 然后输入登陆名和密码, 按submit button

见到网页跳转, 输出
![p4](http://image16.poco.cn/mypoco/myphoto/20150221/10/444127020150221102126047.png?1024x513_130)

好明显, 见到这个请求交由servlet类的doGet()来处理了.

而且见到,我作为用户输入的密码和passwd作为1个url的部分显示在了地址栏等地方, 这样是不太安全的.
这也是Get方法不是很适合提交数据的原因, 因为提交的数据容易被别人看到.


## 四, post请求提交数据的1个例子

### 4.1 修改index.jsp改为post请求. 

修改很简单, 改动1个地方就可以了:
```html
<form action="/TestServlet1/MyServlet2" method="post">
```

### 4.2 在输入用户密码, 执行一次
只修改jsp的话不用重新编译..

![p5](http://image16-c.poco.cn/mypoco/myphoto/20150221/10/44412702015022110304207.png?1004x364_130)

见到这次交由servlet类的dopost()方法处理

而且在地址栏等明显地方是看不到用户提交的数据的.
用户名和密码数据是作为参数, 封装在post请求里面.

所以讲post提交是比Get提交要安全一些的.

但是实际上, http的post请求信息一旦被他人截获, 密码等信息仍然可能被泄露, 因为http协议是明文发送数据的.
所以真正需要严格安全的网页(例如网银登陆),都需要使用https协议.

##五, 总结Get提交和Post提交的一些区别.


- Get提交把提交数据写在url后面, 而Post提交不会
- Get提交有数据容量限制(4K), 而Post提交原则上是没有数据大小限制的, 但是不建议超过64k
- Get提交是即时相应, 所以反应快,  而Post提交会被WebServer放入队列, 所以有时相应会慢点.
