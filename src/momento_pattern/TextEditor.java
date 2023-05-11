package momento_pattern;

public class TextEditor {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public TextEditorState createState()
    {
        return new TextEditorState(content);
    }

    public void undo(TextEditorState state)
    {
        content = state.getStr();
    }
}
