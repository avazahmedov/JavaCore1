package uz.avaz;

import java.util.List;
import java.util.Scanner;

public class ListView {
    public void runList() {
        NotesActions action = new NotesActions();
        CreateNote createNote = new CreateNote();
        while (true) {
            System.out.println("Enter an operation: \n 1 - Create \n " +
                    "2 - Edit \n 3 - Get one note by ID \n 4 - Delete \n 5 - Get all notes");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Note note = createNote.createNote();
                    System.out.println(note);
                    action.addNote(note);
                    System.out.println(action.notes);
                    break;
                case 2:
                    System.out.println("Enter ID of note: ");
                    int editID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new text of note: ");
                    String newText = sc.nextLine();
                    try {
                        action.changeNote(editID, newText);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.println("Enter ID of note: ");
                    int findID = sc.nextInt();
                    action.getOneNote(findID);
                    break;
                case 4:
                    System.out.println("Enter ID of note: ");
                    int deleteID = sc.nextInt();
                    try {
                        action.deleteNote(deleteID);
                        break;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                case 5:
                    List<Note> notes = action.getAllNotes();
                    System.out.println(notes);
                    break;
            }
        }
    }
}
