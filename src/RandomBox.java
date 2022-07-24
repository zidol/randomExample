public class RandomBox {

    public static void main(String[] args) {

        System.out.print("| ");

        double randombox;

        for (int i = 1; i <= 50000; i++)
        {
            randombox = (int) (Math.random() * (50000) + 1);

            if ( 1 <= randombox && randombox <=  5 )
                System.out.print("**SSR** : " + randombox);
            else if ( 4 <= randombox && randombox <=  13  )
                System.out.print("*SR* : " + randombox);
            else
                System.out.print("R  : " + randombox);

            System.out.print(" | ");
        }

        // 마지막은 무조건 SR 이상 등급이 나오게
        randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
        if ( 1 <= randombox && randombox <=  3 )
            System.out.print("**SSR**");
        else if ( 4 <= randombox && randombox <=  100  )
            System.out.print("*SR*");
        System.out.print(" |");

    }

}