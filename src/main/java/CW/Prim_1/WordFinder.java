package CW.Prim_1;

public class WordFinder {

    public Word wordFinder(Text text, Word word) {
        String[] textArr = text.getText().split("");
        for (String s : textArr) {
            if (s.equals(word)) {
                return word;
            }
        }
        return  null;
    }

}
