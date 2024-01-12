package Strings;

import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();    //WNEENESENNN
        System.out.println(getShortestPath(path));
    }
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i< path.length(); i++){
            if(path.charAt(i) == 'E' || path.charAt(i) == 'e')
                x++;
            else if(path.charAt(i) == 'W' || path.charAt(i) == 'w')
                x--;
            else if(path.charAt(i) == 'N' || path.charAt(i) == 'n')
                y++;
            else
                y--;
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);

    }
}
