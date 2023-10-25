public class Main_Lecture_1 {
        public static void main(String[] args){
        int t = 5;
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ints[0] = t;
        ints[2] = t;
        ints[9] = t;
        int[] ints1 = new int[ints.length+1];
                for (int i = 0; i < ints.length; i++) {
                        ints1[i] = ints[i];
                }
                ints = ints1;

        String s = new String("Hello World!");
        s += "????????";

        System.out.println(s);
        System.out.println(s+s);
    }

}
