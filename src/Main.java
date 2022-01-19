public class Main {

    public static void main(String[] args) {
        String[][] strings = makeNewArray();
        CheckArray checkArray = new CheckArray();
        checkArray.setStrings(strings);

        checkArray.summ();

    }

    private static String[][] makeNewArray() {
        String[][] array = new String[][]{{"1","4","5","2"}, {"4","1","3","3"}, {"1","1","9","2"}, {"5","3","2","8"}};
        System.out.println(array + " ");

        return array;
    }


}
