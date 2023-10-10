public class Main {
    public static void main(String[] args) {
        //convert the temperature above to reamur!
        String task1 = ("90 C");
        String output = task1;
        int startPos = 0;
        int spacePos = task1.indexOf(" ");
        String tempNumA = task1.substring(startPos, spacePos);
        int tempNum = Integer.parseInt(tempNumA);
        String newTemp = "" + 4 * tempNum / 5;
        String temp = "R";
        output = newTemp + " " + temp;
        System.out.println(output);

    }
}