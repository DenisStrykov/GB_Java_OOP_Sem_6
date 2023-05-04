package CW.Prim_1;

public class Main {

    public static void main(String[] args) {

        Text text = new Text("Мама мыла раму");

        Word word = new Word("руки");

        Word word1 = new Word("раму");

        WordReplacer wordReplacer = new WordReplacer();
        WordDeleter wordDeleter = new WordDeleter();
        TextAppender textAppender = new TextAppender();
        TextPrinter textPrinter = new TextPrinter();

        textPrinter.printText(text);
        Text text1 = new Text(wordReplacer.replaceWordInText(text, word1, word).getText());
        textPrinter.printText(text1);
        System.out.println("_______________________________________");

        Text text2 = new Text(wordDeleter.deleteWordInText(text1, word).getText());
        textPrinter.printText(text2);
        System.out.println("_______________________________________");

        Text text3 = new Text(textAppender.appendText(text, text2).getText());
        textPrinter.printText(text3);

    }

}
