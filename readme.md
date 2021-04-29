#Translate without use Api !!!

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


2 . After I create class "Scanner" 
```java
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
```