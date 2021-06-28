package GeeB2_2_2;

public class MyArraySizeException extends RuntimeException {

    MyArraySizeException(){
        super("Не совпадает размерность массива");
    }

    public String getError(){
        return "Не совпадает размерность массива";
    }

}
