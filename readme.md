#  Translate without use Api !!! Total 7 lines code !!!

1 . I create maven project and write dependencies (Jsop).
This dependencies need for parsing website . I choose
website WooordHunt.

```java
<dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.13.1</version>
</dependency>
```


2 . After I create class "Scanner" .
Class "Scanner" need for input tetx.
```java
        System.out.println("Напишите слово на английском ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
```


3 . Next we parsim page our website and choose need 
information .
```java
        String url = "https://wooordhunt.ru/word/" + input;
        Document document = Jsoup.connect(url).get();
        Elements element = document.getElementsByClass("t_inline_en");
        System.out.println(element.text());

```
4 . Start program. I want translate word "great"
```java
Напишите слово на английском 
great
большой, отличный, великий, замечательно, вельможи

Process finished with exit code 0
```
