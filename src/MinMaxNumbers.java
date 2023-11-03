import com.sun.source.tree.WhileLoopTree;

import java.util.Random;

public class MinMaxNumbers {
    public static void main(String[] args) {

        int NumberPool = 10, i = 1;
        int Intigerpool, min= 101, max= 0;

        Random x = new Random();

        while (i <= NumberPool){
            Intigerpool = Math.round((x.nextInt(100)+1));
            System.out.println(Intigerpool + " , ");

            if(Intigerpool < min) min = Intigerpool;
            if(Intigerpool > max) max = Intigerpool;

            i++;
        }
        System.out.println("");
        System.out.println("The largest intiger in the group is " + max);
        System.out.println("The smallest intiger in the group is "+ min);
    }
}