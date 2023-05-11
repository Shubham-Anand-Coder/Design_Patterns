package momento_pattern;

import java.util.ArrayList;
import java.util.List;

public class MomentoClass {

    private List<TextEditorState>states= new ArrayList<>();

    public void addState(TextEditorState state) {
        states.add(state);
    }

    public TextEditorState getLast() {
        int ind = states.size()-1;
        TextEditorState last = states.get(ind);
        states.remove(last);
        return last;


    }


}
