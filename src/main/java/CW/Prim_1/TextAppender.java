package CW.Prim_1;

public class TextAppender {

    public Text appendText(Text text, Text newText) {
        return new Text(text.getText().concat(newText.getText()));
    }

}
