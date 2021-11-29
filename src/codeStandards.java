public class codeStandards {
    public static void main(String args[]) {
        /* 
         * Please correct the coding style errors in the function fixThisCode.
         * You can find a good guide to code standards here: 
         * https://google.github.io/styleguide/javaguide.html#s4-formatting
         * Look for: camel case, indentation, spacing, etc.
         */

        fixThisCode(2);
    }

    /*
    * 
    */
    public static void fixThisCode(int num) {
        int samenum, newnum;
        if(num%2==0){
            newnum=num+1; System.out.println("Provided number "+ num + " was even but is now " + newnum);
        }
        else {
            samenum=num;
        System.out.println("yay"+ samenum+ "is an odd number");
        }

    }
}