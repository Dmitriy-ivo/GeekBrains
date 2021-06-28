package GeeB2_2_2;

public class MyArrayDataException extends RuntimeException {
    public int x;
    public int y;

    MyArrayDataException(int x, int y){
        super(x + " " + y);
        this.x = x;
        this.y = y;
    }

    public String callError(){
        String er = x + " " + y;
        return er;
    }

}
