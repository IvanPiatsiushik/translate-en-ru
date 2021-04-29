import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Напишите слово на английском ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String url = "https://wooordhunt.ru/word/" + input;
        Document document = Jsoup.connect(url).get();
        Elements element = document.getElementsByClass("t_inline_en");

        System.out.println(element.text());

    }
}
