import java.util.Random;

public class Random01 {

    public static void main(String[] args) {
        int score = (int)(Math.random()*10)+1;
        String msg = "";
        score *= 100;
        msg = "score: " + score + ", prize: ";

        switch(score){
            case 1000: msg += "fridge, ";
            case 900: msg += "tv, ";
            case 800: msg += "notebook, ";
            case 700: msg += "bicycle, ";
            default: msg += "ballpen";
        }
        System.out.print(msg+"\n");
    }

}