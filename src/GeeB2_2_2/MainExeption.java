/*
1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3 В методе main() вызвать полученный метод, обработать возможные исключения
MySizeArrayException и MyArrayDataException и вывести результат расчета
 */
package GeeB2_2_2;

public class MainExeption {
    public static void main(String[] args) {

        String[][] stArray = new String[][]{{"2","1","3","2"},{"2","1","3","2"},{"2","r","3","2"},{"2","1","3","2"}};

        metProv(stArray);

    }

    public static void metProv(String[][] stArray) throws MyArrayDataException, MyArraySizeException{

        if (stArray.length != 4){
            throw new  MyArraySizeException();
        }

        if (stArray[0].length != 4){
            throw new  MyArraySizeException();
        }

        int sum = 0;

           for (int i = 0; i < stArray.length; i++) {
               for (int j = 0; j < stArray[i].length; j++) {
                   try {
                       sum += Integer.parseInt(stArray[i][j]);
                   }catch (NumberFormatException e){
                       throw new MyArrayDataException(i,j);
                   }
           }

        }

        System.out.println(sum);

    }

}
