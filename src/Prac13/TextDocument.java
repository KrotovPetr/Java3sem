package Prac13;

public class TextDocument implements IDocument{
    public int pages;
    public int fontsSize;
    public void checkText(){
        System.out.println(pages+"  "+fontsSize);
    }
    public void setParams(int pages, int FontSize){
        this.pages=pages;
        this.fontsSize=fontsSize;
    }
    @Override
    public void checkDocument() {
        setParams(2,15);
        checkText();
    }
}
