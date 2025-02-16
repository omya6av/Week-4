package extractionproblems.censorbadwords;

public class CensorBadWords {
    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";
        String regex1 = "damn";
        String regex2 = "stupid";
        String newText = text.replaceAll(regex1 , "****");
        newText = newText.replaceAll(regex2, "****");

        System.out.println(newText);

    }
}
