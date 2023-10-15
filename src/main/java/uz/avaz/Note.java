package uz.avaz;

public class Note {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private int id;
    private String headline;
    private String text;

    public Note(int id, String headline, String text) {
        this.id = id;
        this.headline = headline;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("ID of note: %s, Headline of note: %s, Text of note: %s\n", id, headline, text);
    }

}
