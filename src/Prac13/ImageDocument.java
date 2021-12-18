package Prac13;

public class ImageDocument implements IDocument{
    public int width;
    public int height;

    public void checkImage(){
        System.out.println(height+"  "+width);
    }
    public void setParams(int width, int height){
        this.height=height;
        this.width=width;
    }
    @Override
    public void checkDocument() {
        setParams(300,400);
        checkImage();
    }
}
