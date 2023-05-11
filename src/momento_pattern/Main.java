package momento_pattern;


public class Main {

    public static void main(String[] args){

        TextEditor obj1 = new TextEditor();
        MomentoClass obj2 = new MomentoClass();

        obj1.setContent("King");
        obj2.addState(obj1.createState());

        obj1.setContent("Queen");
        obj2.addState(obj1.createState());

        obj1.setContent("Rook");
        obj2.addState(obj1.createState());

        obj1.setContent("Bishop");
        obj2.addState(obj1.createState());

        obj1.setContent("Knight");
    //    obj2.addState(obj1.createState());

        System.out.println(obj1.getContent());
        obj1.undo(obj2.getLast());
        obj1.undo(obj2.getLast());
        obj1.undo(obj2.getLast());

        System.out.println(obj1.getContent());



    }
}
