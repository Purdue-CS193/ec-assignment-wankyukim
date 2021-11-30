public class codeStandards {
    public static void main(String args[]) {
        /* 
         * Please correct the coding style errors in the function fixThisCode.
         * You can find a good guide to code standards here: 
         * https://google.github.io/styleguidre/javaguide.html#s4-formatting
         * Look for: camel case, indentation, spacing, etc.
         */

        fixThisCode(2);
    }

    /*
    * 
    */
    public static void fixThisCode(int num) {
        int sameNum, newNum;
        if (num % 2 == 0) {
            newNum = num + 1; 
	    System.out.println("Provided number " + num + " was even but is now " + newNum);
        } else {
            sameNum = num;
            System.out.println("yay" + sameNum + "is an odd number");
        }
    }
}
