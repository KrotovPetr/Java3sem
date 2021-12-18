package Prac13;

public class MusicDocument implements IDocument{
    String musicForm;

    public void checkMusic(){
        System.out.println(musicForm);
    }
    public void setParams(String musicForm){
        this.musicForm=musicForm;
    }
    @Override
    public void checkDocument() {
        setParams("mp3");
        checkMusic();
    }
}
