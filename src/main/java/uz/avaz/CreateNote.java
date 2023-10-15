package uz.avaz;

import java.util.Scanner;

public class CreateNote {
    public Note createNote(){
        int id = Integer.parseInt(prompt("Models.uz.avaz.Note ID: "));
        String headline = prompt("note headline: ");
        String text = prompt("Models.uz.avaz.Note text: ");
        return new Note(id, headline, text);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

