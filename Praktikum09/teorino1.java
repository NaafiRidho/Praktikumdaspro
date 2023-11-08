public class teorino1 {
    public static void main(String[] args) {
        int[]arrayA={1,2,3,4,5};
        int[]arrayB=new int[4];

        for(int i = 0; i<arrayB.length; i++){
            arrayB=arrayA;
            System.out.println(arrayB[i]);
        }
    }
}
