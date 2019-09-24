
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
public class Searcher {
    public static void main(String []args) throws IOException{


        String URL = "https://en.bab.la/dictionary/english-chinese/verbal";//dummy url
        Document d = Jsoup.connect(URL).timeout(10000).get(); //10000 because stupidly slow internet
        //Elements content = d.getElementsByAttributeValueContaining("title", "in English");
        Elements co = d.getElementsByTag("strong");
        if(co.isEmpty()){
            System.out.println("oh no");
        }
        //String word1 = d.select("div.gt-baf-cell gt-baf-term-text-parent > span.gt-baf-term-text gt-baf-word-selected > span.gt-baf-cell gt-baf-word-clickable").text();//here I get the text
        //String word2 = d.select("div.gb_Od").text()
        String newtext = co.text().replaceAll("verbal", "");
        System.out.println(newtext);
    }
}

/*<div class="gt-baf-cell gt-baf-term-text-parent"><span class="gt-baf-term-text gt-baf-word-selected"><span class="gt-baf-cell gt-baf-word-clickable">应用</span></span></div>*/