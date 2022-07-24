public class Random {

    public static void main(String[] args) {
        String[] arrValues = {"가", "가", "가", "나", "나", "다", "라", "라", "라", "라"};
        int nGetVal =  (int) (Math.random() * 10);
        System.out.println("nGetVal = " + nGetVal);
        String gettedVal = arrValues[ nGetVal];

        System.out.println("gettedVal = " + gettedVal);
        
        //
    }
}
