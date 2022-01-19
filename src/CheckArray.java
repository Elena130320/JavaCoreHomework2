public class CheckArray {
    public String[][] strings;

    public void setStrings(String[][] strings) {
        try {
            SizeArray(strings);
            this.strings = strings;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            System.out.println("В массиве null!");
            ne.printStackTrace();
        }
    }

    private void SizeArray(String[][] strings) throws MyArraySizeException {
        if (strings.length != 4 || checkLengthStrings(strings)){
            throw new MyArraySizeException("Неподходящий размер массива");
        }
    }

    private boolean checkLengthStrings(String[][] strings) {
        for (String [] str: strings){
            if (str.length!=4){return true;}
        }
        return false;
    }

    public void summ() {
        if (strings == null) {
            System.out.println("массив строк не инициализирован");
            return;
        }

        try {
            summArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private void summArray() throws MyArrayDataException {
        int result = 0;
        for (int i = 0; i < strings.length;i++) {
            String[] str = strings[i];
            for (int j = 0; j < str.length; j++) {
                try {
                    result+=Integer.parseInt(str[j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка, потому что в ассиве не только числа: " + i + ":" + j);
                }
            }
        }
        System.out.println("Сумма = " + result);
    }



}
