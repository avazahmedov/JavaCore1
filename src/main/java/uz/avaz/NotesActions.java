package uz.avaz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotesActions {
    public List<Note> notes = new ArrayList<>();

    public NotesActions() {
    }

    public void addNote(Note note){
        notes.add(note);
    }

    public void getOneNote(int id){
        for (Note note: notes) {
            if (note.getId() == id)
                System.out.println(note);
        }
    }

    public List<Note> getAllNotes(){
        return notes;
    }

    public void changeNote(int id, String text){
        for (Note note:notes) {
            if(note.getId() == id){
                note.setText(text);
            }
        }
    }

    public void deleteNote(int id){
        Iterator iterator = notes.iterator();
        while(iterator.hasNext()) {
            Note note = (Note) iterator.next();
            if(note.getId() == id) {
                iterator.remove();
            }
        }
    }
}
